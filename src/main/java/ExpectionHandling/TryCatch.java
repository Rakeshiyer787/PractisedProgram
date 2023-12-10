package ExpectionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int divisiblebyZero =5/5;
            System.out.println("Rest of the code is "+divisiblebyZero);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic expection"+ e.getMessage());
        }
    }

}
