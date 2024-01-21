package ConditionsLoops;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell the Result");

        int a = sc.nextInt();

        if (a%2 ==1){
            System.out.println("odd");
        }else
            System.out.println("even");
    }
}
