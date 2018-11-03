/*Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.*/

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class WriteReadBinary {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        String filename = "file.bin";
        int[] digitsArray = new int[20];
        long startTimeWrite = System.currentTimeMillis();
        try {
            FileOutputStream outputFile = new FileOutputStream(filename);
            DataOutputStream writer = new DataOutputStream(outputFile);
            for (int i = 0; i < digitsArray.length; i++) {
                digitsArray[i] = 255 + random.nextInt(37);
                writer.writeInt(digitsArray[i]);
                System.out.printf("|%-4d|", digitsArray[i]);
            }
            outputFile.close();
            long finishTimeWrite = System.currentTimeMillis();
            System.out.println("\n" + "Запись завершена" + "\n" + "Время генерации чисел и выполнения записи - " + ( finishTimeWrite - startTimeWrite ) + " миллисекунд(а)" +"\n");
            outputFile.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        long startTimeReader=System.currentTimeMillis();
        try {
            FileInputStream inputFile = new FileInputStream(filename);
            DataInputStream reader = new DataInputStream(inputFile);
            ArrayList<Integer> array = new ArrayList<>();
            int avg=0;
            while (reader.available() > 0) {
                int ch1 = reader.read();
                int ch2 = reader.read();
                int ch3 = reader.read();
                int ch4 = reader.read();
                int i = ( ch1 << 24 ) + ( ch2 << 16 ) + ( ch3 << 8 ) + ( ch4 << 0 );
                System.out.printf("|%-4d|",i);
                array.add(i);
            }
            inputFile.close();
            reader.close();
            for(int i:array){
                avg+=i;
            }
            long finishTimeReader = System.currentTimeMillis();
            System.out.println("\n"+"AVG = " + (avg/array.size()));
            System.out.println("Чтение завершено");
            System.out.println("Время чтения из файла - " + (finishTimeReader-startTimeReader)+" миллисекунд(а)");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
