package ConditionsLoops;

public class Lab073 {
    //simple Exercise
    //using -> instead break statement

    public static void main(String[] args) {
        int w = 03;
        switch (w){
            case 01 -> System.out.println("Its a Laptop");
            case 02 -> System.out.println("Its a computer");
            case 03 -> System.out.println("its a mobile");
            default -> System.out.println("its nothing");
        }

    }
}
