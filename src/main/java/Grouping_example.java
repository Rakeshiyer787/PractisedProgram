import org.testng.annotations.Test;

public class Grouping_example {

        @Test(groups = {"sanity"})
        public void test1(){
            System.out.println("This my first test1....");
        }
        @Test(groups = {"sanity"})
        public void test2(){
            System.out.println("This my first test2....");
        }
        @Test(groups = {"regression"})
        public void test3(){
            System.out.println("This my first test3....");
        }
        @Test(groups = {"regression"})
        public void test4(){
            System.out.println("This my first test4....");
        }
        @Test(groups = {"sanity","regression"})
        public void test5(){
            System.out.println("This my first test5....");
        }

    }


