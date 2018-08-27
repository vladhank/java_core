import java.util.Scanner;
public class Rubles {
	public static void main(String[] args) {
		int money = 457;
		int lastNumber;
		String amount = "рубли";
		lastNumber = money % 10;
		if (lastNumber == 1) {
			amount = "рубль";
		}
		if (lastNumber == 2 || lastNumber == 3 || lastNumber == 4) {
			amount = "рубля";
		}
		if (lastNumber == 5 || lastNumber == 6 || lastNumber == 7 || lastNumber == 8 || lastNumber == 9
				|| lastNumber == 0) {
			amount = "рублей";
		}
		System.out.println(money + " " + amount);
	}
}
