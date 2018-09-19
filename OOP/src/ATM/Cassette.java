package ATM;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Cassette extends ATM implements Withdraw {
    Bills[] bills;
    int amountCassette;
    int remainder;
    int totalMoney = 0;
    int totalBills=0;
    static final Scanner SCAN = new Scanner(System.in);

    public Cassette(int amountCassette) {
        this.amountCassette = amountCassette;
        bills = new Bills[amountCassette];
    }

    public void fillATM() {
        for (int i = 0; i < amountCassette; i++) {
            System.out.println("Введите номинал купюры:");
            int nominal = SCAN.nextInt();
            System.out.println("Введите количество купюр:");
            int amountOfBills = SCAN.nextInt();
            bills[i] = new Bills(amountOfBills, nominal);
        }
        for (int i = bills.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (bills[j + 1].getNominal() > bills[j].getNominal()) {
                    int temp;
                    temp = bills[j].getNominal();
                    bills[j].setNominal(bills[j + 1].getNominal());
                    bills[j + 1].setNominal(temp);
                }
            }
        }

    }

    public void withdraw(int withdrawAmount) {

      /*  for (int i = bills.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (bills[j + 1].getNominal() > bills[j].getNominal()) {
                    int temp;
                    temp = bills[j].getNominal();
                    bills[j].setNominal(bills[j + 1].getNominal());
                    bills[j + 1].setNominal(temp);
                }
            }
        }*/
        //условие не совсем верное
       /* if (withdrawAmount%bills[bills.length-1].getNominal()>0){
            System.out.println("Для введенной суммы нет купюр нужной кратности");}*/
        if (withdrawAmount>totalMoney){
            System.out.println("Для введенной суммы в банкомате недостаточно средств");
            System.out.println("Введите другую сумму");
            withdrawAmount();
        }
        while(withdrawAmount%bills[bills.length-1].getNominal()>0){
            System.out.println("Для введенной суммы нет нужного количества купюр");
            System.out.println("Введите другую сумму");
            withdrawAmount();
        }

        int largestBills = withdrawAmount / bills[0].getNominal();
        remainder = withdrawAmount % bills[0].getNominal();
        if (largestBills > 0) {
            bills[0].setAmountOfBills(bills[0].getAmountOfBills() - largestBills);
            System.out.println("Колличество купюр номиналом " + bills[0].getNominal() + " рублей - " + largestBills + " |");
        }
        int i = 1;
        while (remainder != 0) {
            largestBills = remainder / bills[i].getNominal();
            remainder = remainder % bills[i].getNominal();
            if (largestBills > 0) {
                bills[i].setAmountOfBills(bills[i].getAmountOfBills() - largestBills);
                System.out.println("Колличество купюр номиналом " + bills[i].getNominal() + " рублей - " + largestBills + " |");
            }
            i++;
        }
    }




    public void totalMoney() {

        System.out.println("***Остаток в банкомате***");
        for (int i = 0; i < amountCassette; i++) {
            totalMoney += bills[i].getAmountOfBills() * bills[i].getNominal();
            totalBills+=bills[i].getAmountOfBills();
            System.out.println("Количество купюр номиналом "+bills[i].getNominal()+" - "+bills[i].getAmountOfBills() );
        }

        System.out.println("Общая сумма денег в банкомате " + totalMoney);
        System.out.println("Общее количество купюр " + totalBills);

    }

    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < amountCassette; i++) {
            str.append(bills[i]).append("\n");
        }
        return str.toString();
    }
}
