package Forloop;

public class Multipication_Loop {
    public static void main(String[] args) {
        int size = 10;
            System.out.print("    ");
            for (int i = 1; i <= size; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println();
            System.out.println("    " + "-".repeat(size * 4));

            for (int i = 1; i <= size; i++) {
                System.out.printf("%4d|", i);
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
    }


