package Day2;

public class Duplicate {
    public static void main(String[]args){
        String x ="Rakesh Iyer";
        char [] array = x.toCharArray();
        System.out.println("String is "+x);
        System.out.println("String Duplicate Character are;");
        for (int i = 0; i < x.length(); i++) {
            for (int j = i + 1; j < x.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");

                }
            }
        }

    }
}
