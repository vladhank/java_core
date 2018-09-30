/*
Создать собственный класс-исключение - наследник класса Exception.
        Создать метод, выбрасывающий это исключение.
        Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
*/

        package CustomException;

public class WithdrawException extends Exception {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public WithdrawException(String message, int amount) {
        super(message);
        this.amount = amount;
    }
}
