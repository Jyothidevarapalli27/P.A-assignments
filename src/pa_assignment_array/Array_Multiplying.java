package pa_assignment_array;

public class Array_Multiplying {
    public static void main(String[] args) {
        int[] array =  new int[5];
        for(int i = 0; i< array.length; i++){
            array[i] =  i * 2;
        }
        System.out.print("array multipiy values: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
