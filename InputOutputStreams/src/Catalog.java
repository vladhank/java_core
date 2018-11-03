/*
Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
Для этого использовать рекурсию.
*/

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

public class Catalog {
    public static void catalog(String path) throws FileNotFoundException {
        int count =1;
        File file = new File(path);
        if (file.isDirectory() && file.exists()) {
            File[] files = file.listFiles();
            System.out.println("Каталог: " + file.getName() + " Путь к каталогу: " + file.getPath() + " Размер каталога: " + file.length() + " byte" + "\n");
            if (files.length > 0) {
                System.out.println("-----Содержит  в себе-----");
                for(int i = 0; i < files.length; i++){
                    if (files[i].isDirectory()){
                        System.out.println("Каталог: "+ files[i].getName());
                    }
                    if (files[i].isFile()){
                        System.out.println("Файл: " +files[i].getName() );
                    }
                }
                for (int i = 0; i < files.length; i++) {
                    Date date = new Date(files[i].lastModified());
                    if (files[i].isDirectory()) {
                        System.out.println(".......");
                        catalog(files[i].getAbsolutePath());
                        //System.out.printf("|%-15s|","Каталога "+dir.getName()+" Путь к каталогу "+dir.getAbsolutePath()+" Размер каталога "+dir.length()+"\n");
                    } else {
                        System.out.println("Имя файла: " + files[i].getName() + " Путь к файлу: " + files[i].getAbsolutePath() + " Размер файла: " + files[i].length() + " byte" + " Дата изменения:" + date.toString() + "\n");
                    }
                }
            }

        }
        if (file.isFile() && file.exists()) {
            Date date = new Date(file.lastModified());
            System.out.println("Имя файла: " + file.getName() + " Путь к файлу: " + file.getAbsolutePath() + " Размер файла: " + file.length() + " byte" + " Дата изменения:" + date.toString() + "\n");

        }
        count++;
    }

    public static void main(String[] args)  {
        String path = "/Users/uladzislauhancharenka/Desktop/WindowsFormsApplication1";
        try {
            catalog(path);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
