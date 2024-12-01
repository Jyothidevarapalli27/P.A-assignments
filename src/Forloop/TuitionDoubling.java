package Forloop;

public class TuitionDoubling {
    public static void main(String[] args) {
        double tuition = 10000;
        double targetTuition = tuition * 2;
        double annualIncreaseRate = 0.07;
        int years = 0;
        while (tuition < targetTuition) {
            tuition += tuition * annualIncreaseRate;
            years++;
        }
        System.out.println("The tuition will double in " + years + " years.");
    }
}
