package inheritance;
class HumanBeing{
    public void eat(){
        System.out.println("I love to Eat");
    }
}
  class Hobby extends HumanBeing{
    public void read(){
        System.out.println("Reading is my hobby");
      }
  }
   class learning extends  Hobby{
     public void coding(){
         System.out.println("I love to learn coding");

     }

   }
public class Multilevel_inheritance {
    public static void main(String[] args) {
        learning H = new learning();
        H.read();
        H.eat();
        H.coding();

    }
}
