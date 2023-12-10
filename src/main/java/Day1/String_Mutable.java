package Day1;

public class String_Mutable {
    public static void main(String[]args){
        StringBuilder x =  new StringBuilder("Virat");
        StringBuilder y =  new StringBuilder("Kholi");
        y.append(x);
        System.out.println(y);
    }
}
