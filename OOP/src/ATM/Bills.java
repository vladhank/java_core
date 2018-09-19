package ATM;

public class Bills {
    private int amountOfBills;
    private int nominal;

    public Bills(int amountOfBills, int nominal) {
        this.amountOfBills = amountOfBills;
        this.nominal = nominal;
    }

    public void setAmountOfBills(int amountOfBills) {
        this.amountOfBills = amountOfBills;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getAmountOfBills() {
        return amountOfBills;
    }

    public int getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return "Колличество купюр "+ amountOfBills + " номинал " + nominal + " | ";

    }
}