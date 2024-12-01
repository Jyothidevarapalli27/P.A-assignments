package pa_assignment_array;

import java.util.Scanner;

public class Scanner_Array {
    public static void main (String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("How many favorite things you have?: ");
        int numOfThings = scanner.nextInt();
        scanner.nextLine();

        String [] favorites = new String [numOfThings];

        //creating array correct size

        for(int i =0; i<numOfThings; i++){
            System.out.println("favorite things are #" +(i+1) + ":");
            favorites[i] = scanner.nextLine();
        }
        System.out.println("\nyour favourite things: ");
        for(String things: favorites){
            System.out.println(things);
        }
        scanner.close();
    }
}
