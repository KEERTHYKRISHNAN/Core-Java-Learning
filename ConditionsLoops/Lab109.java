package ConditionsLoops;

import java.util.Scanner;

public class Lab109 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int num = sc.nextInt();



    //Factorial Problem
        int fact =1;
        for (int i = 1; i <=num ; i++) {
            fact = fact*i;
           System.out.println("The factorial value is==> " +  fact);

        }

        sc.close();
}

}