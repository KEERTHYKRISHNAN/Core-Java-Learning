package ConditionsLoops;

import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        //factorial Problem using do while loop
        //5*4*3*2*1
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int fact = 1;
        do {
            fact = fact + i;
            System.out.println("The factorial value is  --> " + fact);
            i++;
        }while (i <= num);

        sc.close();
    }
}
