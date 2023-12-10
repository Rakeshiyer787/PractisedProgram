package Day4;

public class Calculator {
    public void add(int a, int b){
        int sum = a+b;
        System.out.println("Sum of two numbers is"+ sum);
    }
    public int subtraction(int a, int b){
        int sub = a-b;
        return  sub;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,20);
       int x = calculator.subtraction(40,50);
        System.out.println(x);

    }

}

