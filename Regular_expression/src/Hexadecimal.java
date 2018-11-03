import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hexadecimal {
    public static void lookingForHexadecimal(String text) {
        Pattern pattern = Pattern.compile("\\b(0x|0X)[0-9a-fA-F]+\\b");
        // Pattern pattern=Pattern.compile("(?i)\\b0x[0-9a-f]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String randomText = "adas sfas 0X456fBB asd sd a123112 3sa 0x6 das !sf saf asd aggsdas 0x47q d 0X asf dgsdfas";
        lookingForHexadecimal(randomText);
    }
}
