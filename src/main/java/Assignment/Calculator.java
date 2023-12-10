package Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.subtraction(50,90);
        calculator.Float(50.230f,60.223f);

        Scanner Sc = new Scanner(System.in);
        float num1 = Sc.nextFloat();
        System.out.println("Enter number"+num1);
        float num2 = Sc.nextFloat();
        System.out.println("Enter number"+num2);

    }

    public void subtraction(int a,int b){
        int sub = a-b;
        System.out.println("Subtraction of two numbers is "+ sub);

    }
    public void Float(float c, float d){
        double num = c+d;
        System.out.println("Double of two numbers "+ num);
    }

}
