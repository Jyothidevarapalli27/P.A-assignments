package pa_assignment_array;

public class My_Array_Length {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println("first index: " + numbers[0]);
            System.out.println("last index : " + numbers[numbers.length - 1]);
            try {
                System.out.println("index 'length': " + numbers[numbers.length]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }
            try {
                numbers[5] = 60;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }
        }
    }

