public class Html {
    public static String tagReplace(String string){
        //string = string.replaceAll("(?i)<p\\s*\\w+\\s*=\\s*\"\\s*\\w+\\s*\\w*\"\\s*>","<p>");
        string =string.replaceAll("<p\\s?\\w*=\"*\\w*\"*\\W*\\w*>","<p>");
        System.out.println(string);
        return  string;
    }
    public static void main(String[] args) {
        String html = " sadas <p id=\"Dds43\"> <pre> sfdsf<pre> <td>dsd</td> sfs <p id=\"1\"> " +
                "<sada5435> <p class=\"header\">";
        tagReplace(html);

    }
}
