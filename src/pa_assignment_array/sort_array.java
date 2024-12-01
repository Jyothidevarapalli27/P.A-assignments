package pa_assignment_array;

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int [] array =  {0,1,2,4,6,9,13,};

        Arrays.sort(array);

        System.out.println("ascending Order: " + " ");
        for(int i = 0; i<array.length;i++) {
            System.out.print(array[i]);
            if(i < array.length-1 ){
                System.out.print(", ");
            }
        }
        System.out.println("\nsmallest num: " + array[0]);
        System.out.println(("biggest num: " + array[array.length-1]));
    }
}
