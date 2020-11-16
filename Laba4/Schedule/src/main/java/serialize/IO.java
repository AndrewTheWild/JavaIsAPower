package serialize;

import java.io.IOException;

public interface IO<T> {
    String toFile(String filename,T obj) throws IOException;
    T fromFile(String filename);
}
