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

    /**
     * read from system
     *
     * @return NvidiaSmiLogType
     * @throws JAXBException error parse xml
     * @throws XMLStreamException error reader
     */
    public static NvidiaSmiLogType read() throws JAXBException, XMLStreamException {
        ProcResult procResult = new ProcBuilder("nvidia-smi", "--xml-format", "-q")
                .withTimeoutMillis(TimeUnit.SECONDS.toMillis(1000))
                .run();

        return read(procResult.getOutputString());
    }

    /**
     * read from input stream
     *
     * @param inputStream InputStream
     * @return NvidiaSmiLogType
     * @throws JAXBException error parse xml
     * @throws XMLStreamException error reader
     */
    public static NvidiaSmiLogType read(InputStream inputStream) throws JAXBException, XMLStreamException {
        return read(new InputStreamReader(inputStream));
    }

    /**
     * read from file
     *
     * @param file File
     * @return NvidiaSmiLogType
     * @throws FileNotFoundException
     * @throws JAXBException error parse xml
     * @throws XMLStreamException error reader
     */
    public static NvidiaSmiLogType read(File file) throws FileNotFoundException, JAXBException, XMLStreamException {
        return read(new FileReader(file));
    }

    /**
     * read from string
     *
     * @param string xml
     * @return NvidiaSmiLogType
     * @throws JAXBException error parse xml
     * @throws XMLStreamException error reader
     */
    public static NvidiaSmiLogType read(String string) throws JAXBException, XMLStreamException {
        return read(new StringReader(string));
    }

    /**
     * read from io reader
     *
     * @param reader Reader
     * @return NvidiaSmiLogType
     * @throws XMLStreamException error reader
     * @throws JAXBException error parse xml
     */
    public static NvidiaSmiLogType read(Reader reader) throws XMLStreamException, JAXBException {
        XMLStreamReader xsr = xif.createXMLStreamReader(reader);

        JAXBContext jc = JAXBContext.newInstance(NvidiaSmiLogType.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return (NvidiaSmiLogType) unmarshaller.unmarshal(xsr);
    }
}
