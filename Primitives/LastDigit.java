
public class LastDigit {
	public static void main(String[] args) {
		int lookingNumber = 2;
		int number = 52;
		if (lookingNumber == number % 10) {
			System.out.println("последняя цифра числа равна " + lookingNumber);
		} else {
			System.out.println("последняя цифра числа не равна " + lookingNumber);
		}
	}
}
