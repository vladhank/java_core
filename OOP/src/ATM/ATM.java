package ATM;

import java.util.Scanner;

public abstract class ATM  {
    static final Scanner SCAN = new Scanner(System.in);
    private int amountOfNominals;
    private int withdrawAmount;

    public int inputCassete() {
        System.out.println("Сколько номиналов купюр будет в банкомате?");
        amountOfNominals = SCAN.nextInt();
        return amountOfNominals;
    }
    public int withdrawAmount(){
        System.out.println("Какую сумму вы хотите снять?");
        withdrawAmount=SCAN.nextInt();
        return withdrawAmount;
    }

}
