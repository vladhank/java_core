package StringBuilderTime;

public class Main {
    public static void main(String[] args) {
        String string = "Java is awesome";
        try{
            Core.stringAdd(string);
            Core.stringBuilder(string);
        }
       catch (Throwable ex){
           System.out.println("Operation doesn't complete. Reason - " + ex.getMessage());
       }
    }
}
