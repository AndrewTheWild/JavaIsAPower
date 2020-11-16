package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.xml.XmlMapper;

import java.io.*;

public class XmlIO<T> implements IO<T> {
    private static XmlMapper xmlMapper;
    private Class<T> clazz;

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public XmlIO(Class<T> type) {
        this.clazz = type;
        xmlMapper = new XmlMapper();
    }

    public String toFile(String filename, T obj) throws IOException {
        xmlMapper.writeValue(new File(filename), obj);
        try {
            return xmlMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
    public T fromFile(String filename) {
        File file = new File(filename);
        String xml = null;
        T obj=null;
        try {
            xml = inputStreamToString(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            obj = xmlMapper.readValue(xml, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
