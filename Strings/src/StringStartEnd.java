/*Написать функцию, принимающую 2 параметра:
        строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.*/

public class StringStartEnd {

    public static boolean stringStartEnd(String string, String word) {
        string = string.toLowerCase();
        word = word.toLowerCase();
        if (string.startsWith(word) && string.endsWith(word)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        String str = "Don't bite off more than you can chew Don't";
        String word = "dson't";
        System.out.println(stringStartEnd(str, word));
    }
}
