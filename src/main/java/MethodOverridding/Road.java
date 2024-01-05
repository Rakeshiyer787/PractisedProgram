package MethodOverridding;

/*If subclass (child class) has the same method as declared in the parent class,
 it is known as method overriding in Java.*/

class Vehicle {
    public void run() {
        System.out.println("Vehicle runs");
    }
}

 class Bike extends Vehicle {
      public void name() {
          System.out.println("My bike name is Yamaha");

      }
  }
      public class Road{
      public static void main(String[] args) {
          Bike obj = new Bike();
          obj.run();
          obj.name();


      }
    }


