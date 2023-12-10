package ExpectionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int divisibleByZero = 10/5;
            System.out.println(divisibleByZero);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic expection e"+e.getMessage());
        }
        finally {
            System.out.println("Finally blocked");
        }
    }
}
