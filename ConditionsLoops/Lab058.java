package ConditionsLoops;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {

        //Take input from the user and give max out of two
        //a,b a>b -- result should be a else b

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("Max --->   " +a);
        }else {
            System.out.println("Max --->  " +b);
            // concatenation add two or more things
        }



    }
}
