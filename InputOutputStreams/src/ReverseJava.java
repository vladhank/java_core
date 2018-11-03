/*
Задан файл с java-кодом.Прочитать текст программы из файла и записать в другой файл
в обратном порядке символы каждой строки.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseJava {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream inputFile = null;
        BufferedReader reader = null;
        PrintWriter outputStream = null;
        FileOutputStream outputFile = null;
        BufferedWriter writer = null;
        try {
            inputFile = new FileInputStream("/Users/uladzislauhancharenka/Desktop/Java/JavaCode.txt");
            reader = new BufferedReader(new InputStreamReader(inputFile));
            outputStream = new PrintWriter(new FileWriter("/Users/uladzislauhancharenka/Desktop/Java/JavaCodeReverse.txt"));
            outputFile = new FileOutputStream("/Users/uladzislauhancharenka/Desktop/Java/JavaCodeReverse.txt");
            writer = new BufferedWriter(new OutputStreamWriter(outputFile));
            String reverse = "";
            StringBuilder stringBuilder = new StringBuilder();
            String line = "";
            while (( line = reader.readLine() ) != null) {
                reverse = new StringBuilder(line).reverse().toString();
                System.out.println(reverse);
                writer.write(reverse);
            }
            writer.close();
            reader.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
