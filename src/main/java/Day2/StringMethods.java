package Day2;

public class StringMethods {
    public static void main(String[]args){
        String str ="Rakesh @Iyer";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(1));
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.replace('a','@'));
        System.out.println(str.contains("I"));
        System.out.println(str.substring(0,6));
        System.out.println("........*...........");

        String str1="Rakesh";
        String str2="Rakesh";
        String str3="";
        System.out.println(str.compareTo(str1));
        System.out.println(str.endsWith("r"));
        System.out.println(str.startsWith("f"));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str3.isEmpty());
        System.out.println(str1.compareToIgnoreCase(str));
        System.out.println("........*...........");

        String str4=" ";
        String str5="India";
        System.out.println(str4.isBlank());
        System.out.println(str5.concat("WCP"));
        System.out.println(str5.indexOf(2));
        System.out.println("........*...........");

        char [] list1 = {'R','a','k','e','s','h'};
        String list2="";
        System.out.println(list2.copyValueOf(list1));
        System.out.println(list1);
    }
}
