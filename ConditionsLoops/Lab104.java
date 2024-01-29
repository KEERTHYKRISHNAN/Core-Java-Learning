package ConditionsLoops;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
//        Ques: sum of digit is 5+4+3+2+1
        // same like factorial

        int fact = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum of factorial number, I will tell you the value");
        int num = sc.nextInt();

//         int j =1;
//        while (i<= num){
//            fact = fact+i;
//            i++;
//            System.out.println("The sum of factorial value is "+ fact);
//        }

        for (int j = 1; j <= num ; j++) {
         fact = fact+j;
            System.out.println("The sum of factorial value is "+ fact);
        }

        sc.close();
    }
}
