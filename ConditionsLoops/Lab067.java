package ConditionsLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab067 {
    // Switch condition
    //Simple Exercise - Day execution
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-7 ....I will tell you the day");
        int daynumber = sc.nextInt();

       String day = null;


        switch (daynumber){
            case 1:
                System.out.println("Monday");
                        break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Are you Mad");
        }
    }
}
