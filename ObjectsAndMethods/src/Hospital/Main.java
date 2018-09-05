package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(2);
        hospital.input();
        hospital.output();
        hospital.search("John");
        hospital.search(32);
    }
}
