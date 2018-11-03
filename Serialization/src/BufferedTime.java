/*Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и
не буфиризированого символьного ввода вывода.*/

import java.io.*;

public class BufferedTime {

    public static void NotBufferedStream(String inputPath, String outputPath) throws IOException {
        long startNotBufferedStream = System.currentTimeMillis();
        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);
        int symbol;
        while (( symbol = inputStream.read() ) != -1) {
            outputStream.write(symbol);
        }
        inputStream.close();
        outputStream.close();
        long finishNotBufferedSream = System.currentTimeMillis();
        System.out.println("Время чтения/записи небуферизированным потом текстового файла размером 5mb " + ( finishNotBufferedSream - startNotBufferedStream + " миллисекунд" ));

    }

    public static void BufferedStream(String inputPath, String outputPath) throws IOException {
        long startTimeBufferedStream = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        String str;
        while (( str = reader.readLine() ) != null) {
            writer.write(str);
        }
        reader.close();
        writer.close();
        long finishTimeBufferedStream = System.currentTimeMillis();
        System.out.println("Время чтения/записи буферизированным потом текстового файла размером 5mb " + (finishTimeBufferedStream-startTimeBufferedStream)+" миллисекунд");
    }

    public static void main(String[] args) {
        String input = "/Users/uladzislauhancharenka/Desktop/Java/Lorem copy.txt";
        String output = "/Users/uladzislauhancharenka/Desktop/Java/Lorem output.txt";
        try {
            NotBufferedStream(input, output);
            BufferedStream(input,output);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
