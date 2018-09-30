package Generics.Solution;

import com.sun.tools.javah.Gen;

public class Type {
    public static void main(String[] args) {
        Generic<Number,Number> exp = new Generic<>(35.6f,40);
        System.out.println(exp.typpeOFNumber(exp));

    }
}

class Generic<T extends Number,K extends Number>{
    private T number1;
    private K number2;

    public T getNumber1() {
        return number1;
    }

    public K getNumber2() {
        return number2;
    }

    public Generic(T number1, K number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public<T> String typpeOFNumber(Generic generic){
        if (generic.getNumber1() instanceof Double) return "Double";
        if (generic.getNumber1() instanceof Integer) return "Integer";
        else return "Float";
    }
}
