package ExpectionHandling;

public class Finally_Block {
    public static void main(String[] args) {
        try {
            int total = 50/0;
            System.out.println("Your total "+ total);
        }
        catch (ArithmeticException e){
            System.out.println("Not scored"+e.getMessage());
        }
        finally {
            System.out.println("Its blocked");
        }
    }
}
