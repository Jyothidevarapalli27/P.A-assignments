package pa_assignment_array;

import org.w3c.dom.ls.LSOutput;

public class Strings_Double_Array {
    public static void main(String[] args) {

        Object[] mixedArray = {42 ,"Apple", "grapes", "banana",22.00};

        System.out.println("Array elements: ");
        for(Object element : mixedArray){
            System.out.println(element);
        }
    }
}
