package Arrays;

public class Duplicate_Array {
    public static void main(String[] args) {
        int [] num =  new int [] {20,60,70,60,50,20,60};
        System.out.println("Duplicates numbers are");
        for (int i=0;i<num.length;i++){
            for (int j=i ; j<num.length; j++){
                if (num[i]==num[j])
                System.out.println(num[j]);
            }

        }
    }
}
