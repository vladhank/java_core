//Объявите переменную со значением null. Вызовите метод у этой переменной. 

public class NullVariable {
    public static String strToLowerCase(String string){
        string.toLowerCase();
        return string;
    }
    public static void main(String[] args) {
        String str=null;
       try
        {
            strToLowerCase(str);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
