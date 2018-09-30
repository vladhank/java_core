package CustomException;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Bank, CreditCard> someBank = new HashMap<>();
//        CreditCard asd= new CreditCard();
//        Bank sad = new Bank();
        //TODO как внести занчения в такой Map
        //someBank.put("Santander",);

        //TODO ессли указать тип long для  cardnumber выдает ошибку

        CreditCard visa = new CreditCard("Bill", 245376757523L, 1219, 433, 700);

        try {
            visa.withDrawmoney(0);
            visa.changeName("q");
        } catch (WithdrawException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println("Вы ввели " + ex.getAmount());
        } catch (SetNameException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
