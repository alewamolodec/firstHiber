package util;

public class StringFormatter {
    public static String strCheck(String a){
        String str = a.trim() + a.replaceAll("\\d\\s\\W","");
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length() - 1).toLowerCase();
    }
}
