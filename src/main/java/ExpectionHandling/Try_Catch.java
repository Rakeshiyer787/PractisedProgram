package ExpectionHandling;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            int score =100/0;
            System.out.println("Your score is "+score);
        }
        catch (ArithmeticException e){
            System.out.println("Please check your score"+e.getMessage());
        }
    }
}
