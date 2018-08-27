public class NextDay {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Введите день");
		int day = data.nextInt();
		System.out.println("Введите месяц");
		int month = data.nextInt();
		System.out.println("Введите год");
		int year = data.nextInt();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			if (day == 31 && month != 12) {
				day = 1;
				month += 1;

			}
			if (day != 31) {
				day += 1;

			}

			if (day == 31 && month == 12) {	
				day = 1;
				month = 1;
				year += 1;
				
			}

		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day == 30) {
				day = 1;
				month += 1;
			} else {
				day += 1;

			}
		}

		if (month == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

			if (day == 29) {
				day = 1;
				month += 1;
			} else {
				day += 1;
			}

		}
		if (month == 2 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
			if (day == 28) {
				day = 1;
				month += 1;
			} else {
				day += 1;
			}
		}

		System.out.println(day + " " + month + " " + year);

	}

}
