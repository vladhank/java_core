package Polynomial;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> firstPolynomial = new HashMap<>();
        Map<Integer,Integer> secondPolynomial = new HashMap<>();
        Polynomial polynomial = new Polynomial();
        firstPolynomial.put(3,-2);
        firstPolynomial.put(1,4);
        firstPolynomial.put(66,4);
        firstPolynomial.put(0,-3);

        secondPolynomial.put(2,3);
        secondPolynomial.put(3,1);
        secondPolynomial.put(5,-2);
        secondPolynomial.put(1,5);
        secondPolynomial.put(-9,5);
        polynomial.stringAnalyzer(polynomial.addPolynomial(firstPolynomial,secondPolynomial));
    }
}
