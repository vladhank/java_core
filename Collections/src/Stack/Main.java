package Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.setSize();
        while (!stack.outOfStackSize()) {
            stack.fillStack();
        }
        System.out.println(stack);
        //stack.pop();
        stack.peekReverse();
    }
}
