package Dictionary;

import java.util.*;


/*Имеется текст. Следует составить для него частотный словарь.*/

public class Dictionary {

    Map<String, Integer> dictionary = new HashMap<String, Integer>();
    ArrayList<String> array;
    int count;

    public void frequency(String text) {
        //или просто Collections.frequency()
        text = text.toLowerCase();
        array = new ArrayList<String>(Arrays.asList(text.replaceAll("[^а-яА-Я ]", "").split(" ")));
        for (String str:array){
            if(!dictionary.containsKey(str)){
                dictionary.put(str,1);
            }
            else{
                count=dictionary.get(str);
                dictionary.put(str,count+1);
            }
        }

    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                ", array=" + array +
                '}';
    }
}
