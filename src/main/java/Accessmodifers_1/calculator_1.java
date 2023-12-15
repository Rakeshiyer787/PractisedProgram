package Accessmodifers_1;

public class calculator_1 {
    public int subtraction(int a, int b){
        int sub = a-b;
        return  sub;
    }

    private int addition(int c,int d){
        int add = c+d;
        return add;
    }

    protected int dividision(int e,int f){
        int divd = e/f;
        return divd;

    }
    void multiplication(int g, int h){
     int mul = g*h;
     System.out.println("Multiplication of two numbers:"+  mul);


}

    public static void main(String[] args) {
        calculator_1 C= new calculator_1();

       int x = C.subtraction(50,60);
       System.out.println(x);
       int y = C.addition(70,80);
        System.out.println(y);
       int z = C.dividision(80,2);
        System.out.println(z);
        C.multiplication(20,30);
    }
}


