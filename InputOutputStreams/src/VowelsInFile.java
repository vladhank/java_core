//Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
import java.io.*;

public class VowelsInFile {


    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileReader = new FileInputStream("/Users/uladzislauhancharenka/Desktop/Java/Lorem.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileReader));
            String line = "";
            //TODO теряется слово availible_лучше делать через matcher?!
            //System.out.println(line);
            while (( line = reader.readLine() ) != null) {
                String[] text = line.split(" ");
                for (int i = 0; i < text.length; i++) {
                    if (text[i].matches("\\b(?i)(A|E|I|O|U)\\w*")) {
                        System.out.println(text[i]);
                    }
                }
            }
            fileReader.close();
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
