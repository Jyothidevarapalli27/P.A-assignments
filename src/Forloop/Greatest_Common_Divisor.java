package Forloop;
import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer (n1): ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second positive integer (n2): ");
        int n2 = scanner.nextInt();


        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Both numbers must be positive integers.");
        } else {

            int gcd = 1;
            int k = 1;


            while (k <= n1 && k <= n2) {
                if (n1 % k == 0 && n2 % k == 0) {
                    gcd = k;
                }
                k++;
            }
            System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
        }

        scanner.close();
    }
}
