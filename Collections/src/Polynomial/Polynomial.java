package Polynomial;

import com.oracle.javafx.jmx.SGMXBean;

import java.util.*;

public class Polynomial {
    public String addPolynomial(Map<Integer, Integer> firstPolynomial, Map<Integer, Integer> secondPolynomial) {
        String result;
        StringBuilder str = new StringBuilder();
        TreeMap<Integer,Integer> resultMap= new TreeMap<>();
        for(Integer key:firstPolynomial.keySet()){
            if(secondPolynomial.containsKey(key)) {
                resultMap.put(key, firstPolynomial.get(key) + secondPolynomial.get(key));
            }
        }

        for(Integer key:resultMap.keySet()){
            firstPolynomial.remove(key);
            secondPolynomial.remove(key);
        }

        resultMap.putAll(firstPolynomial);
        resultMap.putAll(secondPolynomial);
        System.out.println(resultMap);

        Integer[] array = new Integer[resultMap.size()];
        resultMap.keySet().toArray(array);
        for (int i = 0; i < resultMap.size(); i++) {
            str.append(resultMap.get(array[i]) + "*x^" + array[i] + "");
            if (i != resultMap.size() - 1) {
                str.append(" + ");
            }
        }
        System.out.println(str);
        result=str.toString();
        return result;

    }

    public void stringAnalyzer(String str) {
        str = str.replace(" ", "");
        if (str.contains("+-")) {
            str = str.replace("+-", "-");
        }
        str = str.replace("x^0", "1");
        str = str.replace("x^1", "x");
        str = str.replace("*1", "");
        str = str.replace("1*", "");
        System.out.println(str);

    }

}
