package pa_assignment_array;

public class Array_For_Loop {
    public static void main(String[] args) {
        int[] array = new int [5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.print("values: ");
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
        }
    }
}
