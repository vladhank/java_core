package Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Array firstArray = new Array();
        Array secondArray = new Array();
        firstArray.sizeOfArray();
        firstArray.add();
        secondArray.sizeOfArray();
        secondArray.add();
        firstArray.intersection(secondArray);
        firstArray.merge(secondArray);
    }
}
