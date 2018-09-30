/*Задание Аннотации. Реализовать аннотацию Transaction и анализатор данной транзакции.
Смысл данной аннотации заключается в том, что если метод помечен данной аннотацией,
значит он вызывается в рамках транзакции. В рамках транзакции - когда выводится
на консоль два сообщения: “Transaction is started”; “Transaction is ended”.*/

package Annotation;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationAnalyzer {
    public void analyzerTransaction(Class<?> clazz) throws InvocationTargetException, IllegalAccessException {
        Transaction trs = new Transaction();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Annotation.class)) {
                    System.out.println("Transaction start");
                    method.invoke(trs);
                    System.out.println("Transaction finish");
                }
            }

    }

}
