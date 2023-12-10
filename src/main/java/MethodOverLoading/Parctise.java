package MethodOverLoading;

import java.util.Random;

/*Method overloading means having same classname with
 different parameters*/

public class Parctise {
    public static void main(String[] args) {
        int result= addnumbers(3,5);
        double result1= dividenumbers(56.0,20.0);

        System.out.println(result);
        System.out.println(result1);
        subtarcnumbers();

        Parctise p =new Parctise();
        p.Multipinumbers();


    }
    public static int   addnumbers(int a,int b){
        return a+ b;
    }
    public static double dividenumbers(double c,double d){
        return c/d;
    }
    public static void subtarcnumbers(){
        Random r = new Random();
        System.out.println(r.nextInt(5) - r.nextInt(6));
    }
    public void Multipinumbers(){
        int e =10;
        int f =20;
        System.out.println(e*f);
    }
}
