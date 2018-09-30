package Unique;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;
/*Написать метод countUnique, который принимает целочисленный список в качестве
 параметра и возвращает количество уникальных целых чисел в этом списке.
        При получении пустого списка метод должен возвращать 0.
        Пример:
        [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.*/

/*Написать метод isUnique, который принимает Map<String, String> и возвращает true,
        если два различных ключа не соответствуют двум одинаковым значениям.
        Например, в данном случае вернётся true:

        {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

        А в данном - false:

        {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}*/

public class Unique {

    public int countUnique(ArrayList<Integer> collection) {
        HashSet<Integer> set = new HashSet<>();
        if (collection.size()!= 0) {
            set.addAll(collection);
            System.out.println(collection);
            System.out.println("Количество уникальных целых чисел:" + set.size());
            return set.size();
        } else return 0;
    }



    public boolean isUnique(Map<String, String> collection) {
        HashMap<String, Integer> tempCollection = new HashMap<String, Integer>();
        System.out.println(collection);
        int count = 0;
        boolean isUnique = false;
        for (String key : collection.values()) {
            if (!tempCollection.containsKey(key)) {
                tempCollection.put(key, 1);
            } else {
                count = tempCollection.get(key);
                tempCollection.put(key, count + 1);
            }
        }
        for (Integer value : tempCollection.values()) {
            if (value > 1) {
                isUnique = false;
                break;
            } else {
                isUnique = true;
            }
        }
        if (isUnique == false) {
            System.out.println("Есть повторяющиеся значения");
        }
        if (isUnique == true) {
            System.out.println("Уникальная коллекция");
        }
        System.out.println(isUnique);
        return isUnique;
    }

}
