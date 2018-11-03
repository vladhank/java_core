//Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.

import java.io.*;

public class FileMultilines {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileInput = new FileInputStream("/Users/uladzislauhancharenka/Desktop/Java/Lorem.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInput));
            StringBuffer stringBuffer = new StringBuffer();
            String line = "";
            while ((line=reader.readLine())!= null) {
               stringBuffer.append(line);
               stringBuffer.append("\n");
            }
            fileInput.close();
            reader.close();
            System.out.println(stringBuffer.toString());
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}
