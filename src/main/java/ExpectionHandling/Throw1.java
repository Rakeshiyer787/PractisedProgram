package ExpectionHandling;

public class Throw1 {
    public static void vote(int age){
        if (age<18){
          throw new  ArithmeticException("Not eligble to vote");
        }
        else {
            System.out.println("Eligble to Vote");
        }
    }
    public static void main(String[] args) {
        vote(20);
    }
}
