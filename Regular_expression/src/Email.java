/*Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний,
при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static boolean emailMatches(String text) {

        Pattern pattern = Pattern.compile("[a-zA-Z]\\w*@[a-zA-Z]+\\.(com|org)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        if (Pattern.matches("[a-zA-Z]\\w*@[a-zA-Z]+\\.(com|org)", text)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String string = "jfsdsf_9@look.org sadasdas asf asf a  sdasd9@gmail.com";
        //emailMatches(string);
        System.out.println(emailMatches(string));

    }
}
