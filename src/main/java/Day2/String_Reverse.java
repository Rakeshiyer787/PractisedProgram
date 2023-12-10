package Day2;

public class String_Reverse {
    public static void main(String[]args){
        String str= "RakesH Iyer";
        StringBuffer sb=new StringBuffer();
        for (int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(str);
        System.out.println(sb.toString());
    }
}
