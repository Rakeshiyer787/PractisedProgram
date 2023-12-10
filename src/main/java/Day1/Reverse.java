package Day1;

public class Reverse {
    public static void main(String[]args){
        String str= "Rakesh Iyer";
        StringBuffer reverse = new StringBuffer(str).reverse();
        String output = reverse.toString();
        System.out.println(output);
    }
}
