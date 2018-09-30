/*Написать метод, который в 50% случаев бросает исключение.

 Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.*/


package MethodsException;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MethodsExceptions methodsExceptions = new MethodsExceptions();
       try {
           methodsExceptions.generateException();
           methodsExceptions.Exception50percent();
       }
       /*аналогичная запись
       catch (ClassNotFoundException|RuntimeException ex)*/
       catch (Throwable ex){
           System.out.println(ex.getMessage());
           ex.printStackTrace();
       }
       finally {
           System.out.println("Сухим не выйдешь");
            throw new Error();
       }
    }
}
