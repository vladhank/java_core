/*Дан класс Solution, параметризированный T. Ограничьте параметр T.
T должен быть наследником класса ClassForGenerics и одновременно реализовывать
интерфейс InterfaceForGenerics. Менять можно только класс Solution.*/

package Generics.Solution;


public class Solution<T extends ClassForGenerics&InterfaceForGenerics>{


    public static <T> String typeOfNumber(T variable){
        if (variable instanceof Double) return "Double";
        if (variable instanceof Float) return "Float";
        else return "Integer";
    }
}

class ClassForGenerics<T extends Number>{

}

interface InterfaceForGenerics{
    public <T> String  typeOfNumber(T variable);
}

