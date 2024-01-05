package Interface;

interface detials{
 void printinfo();
}
public class Student implements detials {

    public void printinfo() {
        String name = "Rakesh";
        int age = 25;
        System.out.println(name);
        System.out.println(age);
    }
}
class inerface{
    public static void main(String[] args) {
        Student st = new Student();
        st.printinfo();
    }
}