package ConditionsLoops;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        //Simple Exercise
        //user input statement

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the body parts, i will tell you the where it is");
        String name = user_input.next();

        System.out.println("it belongs to head");
        String head = user_input.next();

        System.out.println("it belongs to stomach");
        String stomach = user_input.next();

        System.out.println("your details are "+ head +" " + stomach +" ");

        user_input.close();


    }
}
