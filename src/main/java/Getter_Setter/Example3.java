package Getter_Setter;

public class Example3 {
    String name;
    int age;
    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }
    public void printdetials(){
        System.out.println(name+","+age);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Example3 a = new Example3();
        a.setName("RAKESH");
        a.setAge(25);
       System.out.println(a.getName());
       System.out.println(a.getAge());
        a.printdetials();


    }
}
