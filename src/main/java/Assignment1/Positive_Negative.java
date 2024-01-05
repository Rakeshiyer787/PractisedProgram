package Assignment1;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        if (num > 10) {
            System.out.println("Number is positive");
        } else if (num <= 10) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
