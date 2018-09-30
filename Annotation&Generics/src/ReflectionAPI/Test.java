package ReflectionAPI;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Test {


    public static void main(String[] args) {
        Account<String> acc1 = new Account();
        String acc1Id = acc1.getId();
        ClassAnalyzer analyzer = new ClassAnalyzer();
        analyzer.analyze(acc1);
        // analyzer.classAnalyzer(analyzer);

    }
}

final class Account<T> implements Accountable<T> {
    private T id;
    private int sum;

    public Account() {
    }

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}

interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

