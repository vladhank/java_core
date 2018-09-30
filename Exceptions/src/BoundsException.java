//Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException

import java.util.Random;

public class BoundsException {
    public static void main(String[] args)  {
        int[] array = new int[17];
        Random random = new Random();
        try {
            for (int i=0;i<18;i++){
                array[i]=random.nextInt(7);
            }

        }
        catch (Exception ex){
            System.out.println("Выход за пределы массива " + ex.fillInStackTrace());
        }
    }
}
