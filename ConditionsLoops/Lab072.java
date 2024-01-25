package ConditionsLoops;

public class Lab072 {
    //simple exercise

    public static void main(String[] args) {
        // this program will execute with the version after JDK13
        // using multiple condition is single line
        int itemcode = 007;
        switch(itemcode){
            case 001, 002, 003:
                System.out.println("Its an Electronic Gadget");
                break;
            case 004, 005, 006:
                System.out.println("Its an Software Product");
                break;
            default:
                System.out.println("its not Electronic or Software Product");
        }
    }
}
