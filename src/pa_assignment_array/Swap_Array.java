
package pa_assignment_array;

public class Swap_Array {
    public static void main(String[] args) {
        String[] array = {"apple","bananas","dragon","egg","cream."};

        System.out.println("Before Swapping: ");
        for(String element : array){
        System.out.print(element + " ");
    }
        int middleIndex = array.length/2;
        String temp = array[0];
        array[0] = array[middleIndex];
        array[middleIndex] = temp;

        System.out.println("\n\nafter swapping: ");
        for(String element: array){
            System.out.print(element + " ");
        }

    }
}

