package Students;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/*
Задание. Создать список оценок учеников с помощью ListIterator,
        заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
*/

public class RemoveStudents {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Students> studentsMark = new ArrayList<>();
        studentsMark.add(new Students("Tom", 5));
        studentsMark.add(new Students("Joli", 8));
        studentsMark.add(new Students("Hank", 3));
        studentsMark.add(new Students("Mark", 8));
        studentsMark.add(new Students("Elton", 2));
        for (int i = 0; i < studentsMark.size(); i++) {
            if (studentsMark.get(i).getMark() < 4) {
                studentsMark.remove(studentsMark.get(i));
            }

        }
        System.out.println("Студенты с хорошей успеваемостью" + studentsMark);

    }
}
