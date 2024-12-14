package Forloop.pa_assignment_array;

public class Array_Clone {
    public static void main (String[] args){
        String[] colors  =  {"green", "blue","yellow"};
        System.out.println("colours length: " + colors.length);
        String[] clonedcolours = colors.clone();
        System.out.println("printing cloned colours: " + clonedcolours.length);
        System.out.println("printing colours: " + colors.length);

    }
}
