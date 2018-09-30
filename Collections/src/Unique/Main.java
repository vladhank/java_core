package Unique;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Unique unique = new Unique();
        ArrayList<Integer> randomList = new ArrayList<>();
        //TODO как заполнить коллекцию сразу в конструкторе?!
        HashMap<String,String> collection = new HashMap<String, String>();
        collection.put("Marty","Stepp");
        collection.put("Stuart","Reges");
        collection.put("Jessica","Miller");
        collection.put("Amanda","Camp");
        collection.put("Hal","Mag");

        for(int i =0;i<10;i++){
            randomList.add(i,random.nextInt(10));
        }
        unique.countUnique(randomList);
        unique.isUnique(collection);
    }
}
