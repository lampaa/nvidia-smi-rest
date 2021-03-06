package com.github.lampaa.smi;

import com.github.lampaa.smi.dtoV1.NvidiaSmiLogType;
import com.github.lampaa.smi.rest.RestApplication;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

@Slf4j
@SpringBootTest(classes = RestApplication.class)
class RestApplicationTests {
    @Test
    void readingTest() throws IOException, JAXBException, XMLStreamException {
        for (int i = 1; i < 8; i++) {
            NvidiaSmiLogType smiLog = SmiReader.read(new ClassPathResource("smi_test_" + i + ".xml").getFile());
            log.info("success read from file smi_test_{}.xml", i);
        }
    }
}
