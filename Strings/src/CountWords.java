/*Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.*/

import java.nio.file.Paths;

public class CountWords {

    public static int countWords(String text){
        int count =0;
        text=text.trim();
        //String[] words = text.split("\\s+");

        while (text.contains("  ")){
            text=text.replace("  ", " ");
        }
        for(int i =0;i<text.length();i++){
            if(text.charAt(i)==' '){
                count++;
            }
        }
        count=count+1;

        System.out.println("Количество слов в тексте - "+count);
        return count;
    }
    public static void main(String[] args) {
        String string="adsdf! sfds,  das dsf sdf sda      sad sdf dsf dsf       knk";
        countWords(string);


    }
}
