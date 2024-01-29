package ConditionsLoops;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //factorial problem using for and while loop
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell the factorial value ");
        int num = sc.nextInt();

//        int i = 1;
//        while (i <= num){
//            fact = fact*i;
//         i++;
//
//        }
//        System.out.println("The factorila value is __> " + fact);


        for (int j = 1; j <= num ; j++) {
        fact = fact*j;
            System.out.println("The factorial value is " + fact);

        }
        sc.close();
    }

}
