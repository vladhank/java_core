package Dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary= new Dictionary();
        String text = "Привет, мой: друг любезный! Привет 5мой друг465 солнце";
       dictionary.frequency(text);
        System.out.println(dictionary);
    }
}
