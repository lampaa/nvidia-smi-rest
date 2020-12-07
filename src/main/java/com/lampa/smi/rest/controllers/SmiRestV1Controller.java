package com.lampa.smi.rest.controllers;

import com.lampa.smi.SmiReader;
import com.lampa.smi.dtoV1.GpuType;
import com.lampa.smi.dtoV1.NvidiaSmiLogType;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.XMLStreamException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping({"/v1", "/"}) // current api
public class SmiRestV1Controller {
    @GetMapping
    private NvidiaSmiLogType getAll() throws JAXBException, XMLStreamException {
        return SmiReader.fromSystem();
    }

    @GetMapping("{gpu}/**")
    private Object getByParams(@PathVariable String gpu, HttpServletRequest request) throws JAXBException, XMLStreamException, NoSuchFieldException, IllegalAccessException {
        String[] mvcPath = ((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE)).split("/");


        List<String> fields = new ArrayList<>();

        for (int i = 3; i < mvcPath.length; i++) {
            fields.add(mvcPath[i]);
        }

        NvidiaSmiLogType smiLog = SmiReader.fromSystem();

        for (GpuType gpuType : smiLog.getGpu()) {
            if (gpuType.getUuid().equals(gpu)) {
                return getFromObject(gpuType, fields);
            }
        }

        throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "gpu not found");
    }

    private Object getFromObject(Object object, List<String> fields) throws IllegalAccessException, NoSuchFieldException {
        if (fields.size() > 0) {
            Field field = object.getClass().getDeclaredField(fields.remove(0));
            field.setAccessible(true);

            return getFromObject(field.get(object), fields);

        } else {
            return object;
        }
    }
}
