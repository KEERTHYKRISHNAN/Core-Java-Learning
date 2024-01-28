package ConditionsLoops;

import java.util.Scanner;

public class Lab102 {
    //Problem Statement - factorial Problem
//    !1 = 1
//    !2 = 2*1
//    !3= 3*2*1
//    !4 = 43*2*1
//    !5 = 5*4*3*2*1 =120

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int fact = 1;

        int i = 1;
        while (i<=num){
            fact = fact*i;
            i++;

        }
        System.out.println("fact --> " +fact);
        sc.close();
    }
}
