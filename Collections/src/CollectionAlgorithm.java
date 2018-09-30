import java.util.*;

/*
Использовать Алгоритмы. Не используя вспомогательных объектов,
        переставить отрицательные элементы сгенерированного списка в конец,
        а положительные – в начало этого списка.
*/


public class CollectionAlgorithm {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(20);
        list.add(-7);
        list.add(13);
        list.add(21);
        list.add(-65);
        ListIterator iterator = list.listIterator();
        Comparator listR= Collections.reverseOrder();
        Collections.sort(list,listR);
        System.out.println(list);
    }
}
