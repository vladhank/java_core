/*Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
        Пример: aaabbcdeef ->abcdef*/

public class ReplaceDuplicates {
    public static void replace(String str){
        String strResult="";
        for (int i =0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                strResult=strResult+str.charAt(i);
            }
        }
        strResult=strResult+str.charAt(str.length()-1);
        System.out.println(strResult);
    }
    public static void main(String[] args) {
    String string = "sfffffdgjsdfdsjglllllkkkkkljioppp";
    replace(string);
    }
}
