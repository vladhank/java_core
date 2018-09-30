package BlackBox;

import java.util.*;
import java.util.function.ToIntFunction;

public class Blackbox {
    private Integer[] blackBox;
    private int size;
    static final Scanner SCAN = new Scanner(System.in);
    TreeMap<Integer, Integer> box = new TreeMap<>();


    public Blackbox(int size) {
        this.size = size;
        blackBox = new Integer[size];
    }

    public void inputDigits() {
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + ( i + 1 ) + " из " + size + " число черного ящика ");
            blackBox[i] = SCAN.nextInt();
            box.put(blackBox[i],i+1);
        }
    }

    public void addDigits() {
        System.out.println("Введите число которое хотите добавить:");
        int digit = SCAN.nextInt();
        box.put(digit,null);
    }

    public void MinMax(){
        box.keySet().toArray(blackBox);
        System.out.println("Введите порядок минимального числа: ");
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(box.keySet());
        int min = SCAN.nextInt();
        System.out.println(array);
        System.out.println(array.get(min-1));
        System.out.println("Введите порядок максимального числа:");
        int max = SCAN.nextInt();
        System.out.println(array.get(array.size()-max));
    }


}
