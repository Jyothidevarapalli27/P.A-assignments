package pa_assignment_array;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,};

        System.out.println("middle element: ");
        for (int i = 0; i <array.length; i++) {
            if(i == 2){
                continue;
            }
            System.out.println("index" + i +":" + array[i]);
        }



    }
}
