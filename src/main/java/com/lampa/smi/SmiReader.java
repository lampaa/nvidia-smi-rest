package com.lampa.smi;

import com.lampa.smi.dtoV1.NvidiaSmiLogType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.buildobjects.process.ProcBuilder;
import org.buildobjects.process.ProcResult;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 * smi reader
 */
public class SmiReader {
    private static XMLInputFactory xif;

    static {
        xif = XMLInputFactory.newFactory();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
    }

    ;

    /**
     * read from system
     *
     * @return NvidiaSmiLogType
     * @throws JAXBException
     * @throws XMLStreamException
     */
    public static NvidiaSmiLogType fromSystem() throws JAXBException, XMLStreamException {
        ProcResult procResult = new ProcBuilder("nvidia-smi", "--xml-format", "-q")
                .withTimeoutMillis(TimeUnit.SECONDS.toMillis(1000))
                .run();

        return fromString(procResult.getOutputString());
    }

    /**
     * read from input stream
     *
     * @param inputStream InputStream
     * @return NvidiaSmiLogType
     * @throws JAXBException
     * @throws XMLStreamException
     */
    public static NvidiaSmiLogType fromInputStream(InputStream inputStream) throws JAXBException, XMLStreamException {
        return fromReader(new InputStreamReader(inputStream));
    }

    /**
     * read from file
     *
     * @param file File
     * @return NvidiaSmiLogType
     * @throws FileNotFoundException
     * @throws JAXBException
     * @throws XMLStreamException
     */
    public static NvidiaSmiLogType fromFile(File file) throws FileNotFoundException, JAXBException, XMLStreamException {
        return fromReader(new FileReader(file));
    }

    /**
     * read from string
     *
     * @param string xml
     * @return NvidiaSmiLogType
     * @throws JAXBException
     * @throws XMLStreamException
     */
    public static NvidiaSmiLogType fromString(String string) throws JAXBException, XMLStreamException {
        return fromReader(new StringReader(string));
    }

    /**
     * read from io reader
     *
     * @param reader Reader
     * @return NvidiaSmiLogType
     * @throws XMLStreamException
     * @throws JAXBException
     */
    public static NvidiaSmiLogType fromReader(Reader reader) throws XMLStreamException, JAXBException {
        XMLStreamReader xsr = xif.createXMLStreamReader(reader);

        JAXBContext jc = JAXBContext.newInstance(NvidiaSmiLogType.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return (NvidiaSmiLogType) unmarshaller.unmarshal(xsr);
    }
}
