/*
Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного
слова совпадает с первой буквой следующего слова
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastSymbol {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream inputFile = new FileInputStream("/Users/uladzislauhancharenka/Desktop/Java/Lorem.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputFile));
            String line ="";
            while ((line=reader.readLine())!= null) {
                //System.out.println(line);
                line = line.replaceAll("\\s{2,}", " ");
                Pattern pattern = Pattern.compile("\\w*(\\w)(?=\\s\\1)");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
            inputFile.close();
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
