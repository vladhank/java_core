package Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*Определить множество на основе множества целых чисел.
        Создать методы для определения пересечения и объединения множеств.*/


public class Array {
    static final Scanner SCAN = new Scanner(System.in);
    ArrayList<Integer> array;
    int size;

    public Array() {
        array = new ArrayList<>(size);
    }

    public int sizeOfArray() {
        System.out.println("Введите размер  множества");
        size = SCAN.nextInt();
        return size;
    }

    public void add() {
        while (size > 0) {
            int element = 0;
            System.out.println("Введите элеменет множества");
            array.add(element = SCAN.nextInt());
            size--;
        }
    }

    public void intersection(Array secondArray) {
       this.array.retainAll(secondArray.array);
        System.out.println("Перечесение заданных множеств: " + this.array);
    }

    public void merge(Array secondArray){
        this.array.addAll(secondArray.array);
        System.out.println("Множество после слияния " + this.array);
    }

}
