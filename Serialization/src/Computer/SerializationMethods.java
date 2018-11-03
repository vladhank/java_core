package Computer;

import java.io.*;

public class SerializationMethods {
    public static void Serialization(Object object,String filePath) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(object);
        oos.close();
    }

//    TODO лучше выносить такие методы в отдельный класс ?

    public static Object Deserialization(String filePath) throws IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Object object = ois.readObject();
        ois.close();
        return object;
    }
}
