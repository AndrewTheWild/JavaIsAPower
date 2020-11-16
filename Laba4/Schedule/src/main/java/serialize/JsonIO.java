package serialize;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonIO<T> implements IO<T>{
    private Class<T> clazz;

    public JsonIO(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public String toFile(String filename, T obj) {
        Gson gson=new Gson();
        String json=gson.toJson(obj);
        try(FileWriter writer=new FileWriter(filename)) {
            gson.toJson(obj, writer);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public T fromFile(String filename) {
        T obj=null;
        try(FileReader reader=new FileReader(filename)){
            obj = new Gson().fromJson(reader,clazz);
            System.out.println(obj.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
