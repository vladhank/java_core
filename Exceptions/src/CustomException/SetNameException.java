/*Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
        Добавить вконструктор своего класса возможность указания сообщения.*/

        package CustomException;

public class SetNameException extends RuntimeException {
    private String name;

    public SetNameException(String message) {
        super(message);
    }

    public SetNameException(String message, String name) {
        super(message);
        this.name = name;
    }
}
