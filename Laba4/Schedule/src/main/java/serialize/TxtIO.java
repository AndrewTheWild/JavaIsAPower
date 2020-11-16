package serialize;

import java.io.*;

public class TxtIO<T> implements IO<T>{

    public String toFile(String filename, T obj) throws IOException {

        try(FileOutputStream file=new FileOutputStream(filename))
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

            objectOutputStream.writeObject(obj);

            objectOutputStream.close();
        }
        catch(IOException ex){

            return ex.getMessage();
        }
        return "Done";
    }


    public T fromFile(String filename) {
        T obj=null;
        try(FileInputStream fileInputStream = new FileInputStream(filename)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            obj = (T) objectInputStream.readObject();
            objectInputStream.close();
        }
        catch (IOException ex){
           System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
