
public class ReplaceSymbols {
	public static void main(String[] args) {
		String researchString="?,Do u # know Actions # speak # louder ? than words.";
		researchString=researchString.replace("?", "Hello").replace("#","");
		System.out.println(researchString);
	}

}
