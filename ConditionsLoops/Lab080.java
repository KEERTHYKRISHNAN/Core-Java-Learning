package ConditionsLoops;

public class Lab080 {
    public static void main(String[] args) {
        boolean b1 = true;
        b1 = false;
        for ( ;b1; ){
            System.out.println("Keerthy");
            // nothing will be printed since the conditon is false b1
            //if it is true condtion, it will print infinite
        }
    }
}
