package Stack;

import org.omg.CORBA.INTERNAL;

import java.util.*;

	/*Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс,
	 поддерживающий 3 операции:
        •	Задать размер стека.
        •	Внести цифру в стек.
        •	Извлечь цифру из стека.
        Вывести число, у которого цифры идут в обратном порядке.*/


public class Stack<T> {
    static Scanner scanner = new Scanner(System.in);
    LinkedList<T> items = new LinkedList<>();
    ListIterator<T> listIterator = items.listIterator();
    static private int size;

    public int getSize() {
        return size;
    }

    public static void inputSize() {

    }

    public void setSize() {
        System.out.println("Задайте размер стека");
        size = scanner.nextInt();
    }

    public void fillStack() {
        System.out.println("Введите элемент стека:");
        Integer value = scanner.nextInt();
        push((T) value);

    }

    public boolean outOfStackSize() {
        if (items.size() > getSize() - 1) {
            System.out.println("Стек заполнен");
            return true;
        } else return false;
    }

    public void push(T value) {
        items.addLast(value);
        //то же самое что просто метод add
    }

    public boolean isEmpty() {
        return ( items.size() == 0 );
    }

    //pop
    public <T> T pop() {
        System.out.println(items.getLast());
        return (T) items.getLast();
    }


    public void peekReverse() {
        while (!items.isEmpty()){
            System.out.println(items.removeLast());
        }
    }

    /*public void peekReverse() {
        Collections.reverse(items);
        System.out.println(items);
    }*/


    @Override
    public String toString() {
        return "Stack{" +
                "items=" + items +
                '}';
    }


}
