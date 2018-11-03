public class IPv4 {
    public static boolean isIPv4 (String string){
        if(string.matches("\\b(25[0-5]|2[0-4][0-9]|[1]?[1-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)){3}\\b")) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        String string = "125.0.192.144";
        System.out.println(isIPv4(string));
    }
}
