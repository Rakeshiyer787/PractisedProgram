package Day3;

import Day4.Calculator_1;

public class Assignment extends Calculator_1 {


    public static void main(String[] args) {
        Assignment assignment=new Assignment();
        int a=assignment.Multiplication(50,60);
        float b=assignment.Float1(20.10f,5.10f);
        assignment.Double(60.50,20.50);
        System.out.println("Multiplication of two numbers "+a);
        System.out.println("Float of two numbers "+ b);

    }
}
