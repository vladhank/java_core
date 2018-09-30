package Students;

import java.util.*;

/*Вывести учеников из списка в обратном порядке. (2 варианта решения).*/

public class ReverseSrudents {
    public static void main(String[] args) {
        List<Students> studentsMark = new LinkedList<Students>();
        studentsMark.add(new Students("Tom", 5));
        studentsMark.add(new Students("Joli", 8));
        studentsMark.add(new Students("Hank", 3));
        studentsMark.add(new Students("Mark",8));
        studentsMark.add(new Students("Elton", 2));
        ListIterator iterator = studentsMark.listIterator();
        System.out.println("Список элементов обратном порядке");

        Collections.reverse(studentsMark);
        for (Students students:studentsMark){
            System.out.println(students);
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
