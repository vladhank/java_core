package ATM;

public class ATMPrior extends ATM {

    public static void main(String[] args) {
        ATMPrior atm_prior = new ATMPrior();
        boolean checkAmount = false;

        Cassette cassette = new Cassette(atm_prior.inputCassete());
        cassette.fillATM();
        cassette.totalMoney();
       // cassette.output();
        int withdrawAmount=atm_prior.withdrawAmount();
        cassette.withdraw(withdrawAmount);
        cassette.totalMoney();

    }
}
