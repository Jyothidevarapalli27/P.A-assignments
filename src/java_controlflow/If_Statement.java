package java_controlflow;

public class If_Statement {
    public static void main(String[] args) {
        int x = 7;
        if (x < 10) {
            System.out.println("print less then 10");

            x = 15;
            if (x > 15) {
                System.out.println("print less then 10");
            }
        }
    }
}
