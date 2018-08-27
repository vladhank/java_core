
public class StringSplit {
	public static void main(String[] args) {
	String FatherString="The grass is always greener on the other side of the fence";
	int lenght=FatherString.length();
	String FirstHalf;
	String SecondHalf;
	FirstHalf=FatherString.substring(0, lenght/2);
	SecondHalf=FatherString.substring(lenght/2);
	System.out.println(FirstHalf);
	System.out.println(SecondHalf);
	}

}
