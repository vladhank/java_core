package CustomException;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreditCard {
    //TODO
    //Map<Bank, CreditCard> cardName = new HashMap<>();
    final static Scanner SCAN = new Scanner(System.in);
    private String name;
    private long cardNumber;
    private int date;
    private int cvv;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public CreditCard(Map<Integer, String> cardName, int date, int cvv, int balance) {
        //this.cardName = cardName;
        this.date = date;
        this.cvv = cvv;
        this.balance = balance;
    }


    public CreditCard(String name, long cardNumber, int date, int cvv, int balance) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.date = date;
        this.cvv = cvv;
        this.balance = balance;
    }

    public int getDate() {
        return date;
    }

    public int getCvv() {
        return cvv;
    }

    public void changeName(String newName) throws SetNameException {
        if (newName == null) throw new SetNameException("Вы ничего не ввели");
        if (newName.length() < 2) throw new SetNameException("Имя не может состоят из одного символа ", newName);
        setName(newName);
    }

    public int withDrawmoney(int withdrawAmount) throws WithdrawException {
        if (withdrawAmount == 0) throw new WithdrawException("Сумма должна быть больше 0", withdrawAmount);
        balance -= withdrawAmount;
        return withdrawAmount;
    }
}
