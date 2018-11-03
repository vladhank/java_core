//Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsInARow {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream inputFile = new FileInputStream("/Users/Uladzislauhancharenka/Desktop/Java/Text digits.txt");
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(inputFile));
            String line = "";
            String digitsStr = "";
            int count=0;
            int lineNumber=1;
            while((line=reader.readLine())!=null){
                Pattern pattern = Pattern.compile("\\d{2,}");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    if(lineNumber!=reader.getLineNumber()){
                        System.out.println("Наибольшее число цифр подряд = "+count);
                        count=0;
                    }
                    lineNumber=reader.getLineNumber();
                    digitsStr=matcher.group();
                    if(count<digitsStr.length()){
                        count =digitsStr.length();
                    }
                    System.out.println("Совпадение в "+ reader.getLineNumber()+" строке "+ matcher.group());
                }
            }
            System.out.println("Наибольшее число цифр подряд " + count);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}


