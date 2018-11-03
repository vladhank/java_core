/*Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре,
а результирующая строка должна быть в верхнем.*/

import javax.print.DocFlavor;

public class FIO {

    public static String fio(String firstname, String lastname, String middlename){
        StringBuilder str = new StringBuilder();
        str.append(firstname.charAt(0)).append(".").append(lastname.charAt(0)).append(".").append(middlename.charAt(0)).append(".");
        String fioString = str.toString().toUpperCase();
        return  fioString;
    }

    public static void main(String[] args) {
        String name = "John";
        String lastname = "Malkovich";
        String middlename = "Gavin";
        System.out.println(fio(name,lastname,middlename));

    }
}
