package java_controlflow;

public class If_else {
    public static void main (String[]args){
        int x = 15;
        if(x < 10){
            System.out.println("print less then 10");
        }else if (x>10 && x<20){
            System.out.println("print between 10 and 20");
        }else if (x >=20 ){
            System.out.println("greater equals 20");
        }
        x = 50;

        if(x<10) {
            System.out.println("print less then 10");
        } else if (x>10 && x<20) {
            System.out.println("print between 10 and 20");
        } else if (x >=20) {
            System.out.println("grater then equal to 20");
        }

    }
}
