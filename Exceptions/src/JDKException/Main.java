/*Бросить одно из существующих в JDK исключений,
        отловить его и выбросить своё собственное, указав в качестве причины отловленное.*/

package JDKException;

public class Main {
    public static void main(String[] args) throws GetStandartException {
       int a =0;
       int b=a;
       int c=0;
        try {
            c=a/b;
        }
        catch (Exception ex){

            //System.out.println(ex.getMessage());
            throw new GetStandartException(ex,"Что-то пошло не так - "+ ex.getMessage());
        }

    }
}