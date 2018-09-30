package Annotation;

import java.lang.reflect.InvocationTargetException;

public class Transaction {
    @Annotation
    public static void transactionMethod() {
        System.out.println("Transaction in process....");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        AnnotationAnalyzer ant= new AnnotationAnalyzer();
        ant.analyzerTransaction(Transaction.class);

    }

}
