package Day1;

public class StringReverse {
    public static void main(String[]args){
        String str ="Independent";
        StringBuilder reverse = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--)  {
            reverse.append(str.charAt(i));
        }
        System.out.println(str);
        System.out.println(reverse.toString());
    }

}
