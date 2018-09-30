package Students;

import java.util.ArrayList;
import java.util.ListIterator;

/*Задание. Создать список оценок учеников с помощью ListIterator,
        заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.*/

public class StudentsMaxMark {
    public static void main(String[] args) {
        ArrayList<Students> studentsMark = new ArrayList<>();
        studentsMark.add(new Students("Tom", 5));
        studentsMark.add(new Students("Joli", 8));
        studentsMark.add(new Students("Hank", 3));
        studentsMark.add(new Students("Mark",8));
        studentsMark.add(new Students("Elton", 2));
        ListIterator<Students> iterator = studentsMark.listIterator();
        int indexMaxMark=0;
        int maxMark=0;
        int count=0;
        for(int i=0;i<studentsMark.size();i++) {

            if(studentsMark.get(indexMaxMark).getMark()<=studentsMark.get(i).getMark()){
                count++;
                maxMark=studentsMark.get(i).getMark();
            }
        }
        ArrayList<Students> maxMarkStudents= new ArrayList<>(count-1);
        for (int i=0;i<studentsMark.size();i++){
            if(maxMark<=studentsMark.get(i).getMark()){
                indexMaxMark=i;
                maxMarkStudents.add( new Students(studentsMark.get(indexMaxMark).getName(),studentsMark.get(indexMaxMark).getMark()));
            }
        }
        System.out.println("Cтуденты с максимальными оценками"+maxMarkStudents);


    }
}

