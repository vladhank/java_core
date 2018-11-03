/*Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов,
дополненных слева нулями. Если число выходит за размер 10 символов вернуть все нули.
Пример getString(22) -> 0000000022
Найти 3 способа решения задачи и определить наиболее быстрый способ.*/


public class StringWithZero {

    static String zeroConcat(int number) {
        String stringZero = "";
        String numberString = Integer.toString(number);
        if (numberString.length() >= 10) {
            stringZero = "0000000000";
            System.out.println(stringZero);
            return stringZero;
        } else {
            long startTimeConcat = System.currentTimeMillis();
            while (stringZero.length() != ( 1000 - numberString.length() )) {
                stringZero = stringZero.concat("0");
            }
            stringZero = stringZero + numberString;
            long endTimeConcat = System.currentTimeMillis();
            long perfomanceTimeConcat = endTimeConcat - startTimeConcat;
            System.out.println("Итоговая строка - " + stringZero + "\n"
                    + "Время выполения конкотенации - " + perfomanceTimeConcat + " миллисекунд(а)");
            return stringZero;
        }
    }

    static String builderZero(int number){
        StringBuilder builderString = new StringBuilder();
        //String builderString="";
        String numberString = Integer.toString(number);
        long startTimeBuilder = System.currentTimeMillis();
        while (builderString.toString().length()!=1000-numberString.length()){
            builderString.append("0");
        }
        long endTimeBuilder=System.currentTimeMillis();
        long perfomanceTimeBuilder=endTimeBuilder-startTimeBuilder;
        System.out.println("Итоговая строка - " + builderString.toString() + "\n"
                + "Время работы StringBuilder - " + perfomanceTimeBuilder + " миллисекунд(а)");
        return builderString.toString();

    }

    public static void main(String[] args) {
        int someNumber = 12;
        zeroConcat(someNumber);
        builderZero(someNumber);

    }
}
