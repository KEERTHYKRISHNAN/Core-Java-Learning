package ConditionsLoops;

public class Lab071 {
    //simple Exercise

    public static void main(String[] args) {
        byte b = 10;
        switch (b){
            case 1 :
                System.out.println("Ten");
            case 20:
                System.out.println("Tewnty");
                // if we execute the program till this, no values will be printed in result
                //since byte b = 10, was not matching with any case and default values was not framed

            default:
                System.out.println("default");
        }
    }
}
