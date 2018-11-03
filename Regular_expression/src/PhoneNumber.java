
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void phoneNumber(java.lang.String string) {
        String tempString;
        String prefix;
        String carrierCode;
        String phoneDigits;
        String phoneDigits2;
        String phoneDigits3;
        String phoneNumber;
//      Pattern pattern = Pattern.compile("\\+375\\d{9}");
        Pattern pattern = Pattern.compile("\\B(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})\\b");

        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group(1) + "(" + matcher.group(2) + ")" + matcher.group(3) + "-" + matcher.group(4) + "-" + matcher.group(5));
           /* tempString=matcher.group();
            prefix=tempString.substring(0,4);
            carrierCode=tempString.substring(4,6);
            phoneDigits=tempString.substring(6,9);
            phoneDigits2=tempString.substring(9,11);
            phoneDigits3=tempString.substring(11,13);
            phoneNumber=prefix+"("+carrierCode+")"+phoneDigits+"-"+phoneDigits2+"-"+phoneDigits3;
            System.out.println(phoneNumber);*/
        }
    }

    public static void main(String[] args) {
        String someString = "sadasd +375293076454 dasd +375447757577";
        phoneNumber(someString);

    }
}
