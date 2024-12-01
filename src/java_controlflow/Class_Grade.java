package java_controlflow;

import java.util.Scanner;

public class Class_Grade {
    public static void main (String []args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int score = scanner.nextInt();

        if (score >= 90 && score < 100) {
            System.out.println(" Grade: A");

        } else if (score >= 80 && score < 89) {
            System.out.println("Grade: B");

        } else if (score >= 70 && score < 79) {
            System.out.println("Grade: C");

        } else if (score >= 60 && score < 69) {
            System.out.println("Grade: D");

        } else if (score >= 0 && score < 60) {
            System.out.println("Grade: F");
        }else {
            System.out.println("Invalid scour. please enter a value between 0 to 100");
        }
    }
}
