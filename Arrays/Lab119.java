package Arrays;

import java.util.Scanner;

public class Lab119 {
    public static void main(String[] args) {
        //Leap Year Problem
        //A Leap year is divisible by 4
        //but not by 100 unless it also divisble by 400
        //use and if else statement to determine

        Scanner sc = new Scanner(System.in);
        System.out.println("Print the Year, I will tell you whether ist s Lep Year");
        int year = sc.nextInt();
        //int year = 2000;
        if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0 )){
            System.out.println("Leap Year");

        }else System.out.println("Not a Leap Year");

    }
}
