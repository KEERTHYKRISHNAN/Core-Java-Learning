package ConditionsLoops;

public class Lab094 {
    //print the even and odd number

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i%2==1) {
                System.out.println("value is odd ->" + i);
                continue;

            }

            System.out.println("value is even -->" +i);

        }
    }
}
