
public class RectangleCover {
	public static void main(String[] args) {
		int sideA = 3;
		int sideB = 4;
		int radius = 5;
		double expectedRadius = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

		if (radius >= expectedRadius) {
			System.out.println("Заданный размер подходит");
		} else {
			System.out.println("Заданный размер не  подходит");
		}
	}
}
