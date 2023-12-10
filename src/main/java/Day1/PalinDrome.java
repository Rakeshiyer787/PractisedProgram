package Day1;

public class PalinDrome {
    public static void main(String[]args){
        String str =new String("radar");
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data =buffer.toString();
        if (str.equals(data)){
            System.out.println("Given String is a palindrome");
        } else {
            System.out.println("Give String is not palindrome");
        }

    }
}
