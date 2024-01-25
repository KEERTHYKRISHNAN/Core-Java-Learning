package ConditionsLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab075 {
    //simple Exercise
    // take the user input and print the information

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();

        System.out.println("Enter your age");
        String age = user_input.next();

        System.out.println("Enter your Salary");
        String salary = user_input.next();

        System.out.println("Your details are "+ name+ " "  + age+ " "  + salary+" " );
        user_input.close();



    }
}
