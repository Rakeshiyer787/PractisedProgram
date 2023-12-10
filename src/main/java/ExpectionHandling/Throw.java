package ExpectionHandling;

public class Throw {
    public static void check(int age) {
        if(age<18) {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!");
        }
    }
    public static void main(String args[]){
        check(19);
    }
}
