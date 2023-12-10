package Day4;

public class Calculator_1 {
    public void Double(double c, double d){
        double num = c+d;
        System.out.println("Double of two numbers "+ num);
    }

    public int Multiplication(int c, int d){
        int multiply= c*d;
        return multiply;
    }
    public float Float1(float d, float e){
        float div=d/e;
        return div;
    }
    public static void main(String[] args) {
        Calculator_1 calculator1 = new Calculator_1();

        calculator1.Double(10.2,60.50);

        float z=calculator1.Float1(40.30f,50.30f);

        int y=calculator1.Multiplication(20,30);

        System.out.println("Multiplication of two numbers is"+  y);

        System.out.println("Float of two numbers is "+  z);

    }

}
