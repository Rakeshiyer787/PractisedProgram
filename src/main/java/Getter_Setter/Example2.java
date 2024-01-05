package Getter_Setter;

public class Example2 {
    String name;
    int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void printdetials(){
        System.out.println(name+","+age);
    }
    public static void main(String[] args) {
        Example2 a = new Example2();
        a.setName("Rakesh");
        a.age=25;
        a.printdetials();


    }
}
