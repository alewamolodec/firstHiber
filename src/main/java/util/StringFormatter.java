package util;

public class StringFormatter {
    public static String strCheck(String a){
        String str = a;
        str = str.trim() + str.replaceAll("\\d\\s\\W","");
        str = str.substring(0,1).toUpperCase() + str.substring(1,str.length()-1).toLowerCase();
        return str;
    }
}
