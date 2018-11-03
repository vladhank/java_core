/*Заменить все грустные смайлы :( в строке на весёлые :)*/

public class ReplaceSymbols {
    public static void main(String[] args) {
        String str = ":(If there were no clouds, we should:( not enjoy the sun:(";
        System.out.println(str.replace(":(",":)"));
    }
}
