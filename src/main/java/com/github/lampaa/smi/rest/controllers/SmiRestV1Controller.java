package com.github.lampaa.smi.rest.controllers;

import com.github.lampaa.smi.SmiReader;
import com.github.lampaa.smi.dtoV1.GpuType;
import com.github.lampaa.smi.dtoV1.NvidiaSmiLogType;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
@RequestMapping({"/v1"}) // current api
public class SmiRestV1Controller {
    @GetMapping
    @ApiResponse(description = "Get all log")
    private NvidiaSmiLogType getAll() throws JAXBException, XMLStreamException {
        return SmiReader.read();
    }

    @GetMapping("{gpu_uuid}/**")
    @ApiResponse(description = "Get log by gpu and fields")
    private Object getByParams(@PathVariable String gpu_uuid, HttpServletRequest request) throws JAXBException, XMLStreamException, NoSuchFieldException, IllegalAccessException {
        String[] mvcPath = ((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE)).split("/");


        List<String> fields = new ArrayList<>();

        for (int i = 3; i < mvcPath.length; i++) {
            fields.add(mvcPath[i]);
        }

        NvidiaSmiLogType smiLog = SmiReader.read();

        for (GpuType gpuType : smiLog.getGpu()) {
            if (gpuType.getUuid().equals(gpu_uuid)) {
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
