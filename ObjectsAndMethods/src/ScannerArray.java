import java.util.Scanner;

public class ScannerArray {
    public static int[] bubbleSorting(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void input(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " занчение массива");
            array[i] = scan.nextInt();

        }
    }

    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " элемент массива " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        input(array);
        bubbleSorting(array);
        System.out.println("Отсортированный массив выглядит");
        output(array);
    }
}
