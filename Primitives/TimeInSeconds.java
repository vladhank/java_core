
public class TimeInSeconds {
	public static void main(String[] args) {
		int time = 100000;//in sec
		int hours = time / 3600;
		time = time - hours * 3600;
		int minutes = time/60;
		time = time - minutes*60;
		int sec = time;
		System.out.println("Time: " + hours + ":" + minutes + ":" + sec);
	}
}
