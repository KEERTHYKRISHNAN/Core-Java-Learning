package ConditionsLoops;

public class Lab108 {
    //print the Prime number using for and while loop
    public static void main(String[] args) {

        //for condition

//        for (int i = 1; i <=10 ; i++) {
//            if (i%2==1){
//                System.out.println("The Prime number is " +i);
//                continue;
//
//            }
//            System.out.println("--its not a Prime number --" +i);
//        }

            //while condition

        int i = 1;
        while (i <= 10) {
            if (i % 2 == 1)

                System.out.println("The Prime number is " + i);
                else
                System.out.println("--its not a Prime number --" + i);
                i++;
        }

    }
}


