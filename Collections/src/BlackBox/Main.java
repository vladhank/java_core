package BlackBox;

public class Main {
    public static void main(String[] args) {
        Blackbox blackbox = new Blackbox(5);
        blackbox.inputDigits();
        System.out.println(blackbox);
        System.out.println(blackbox.box);
        blackbox.addDigits();
        System.out.println(blackbox.box);
        blackbox.MinMax();
    }
}
