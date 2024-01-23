package ConditionsLoops;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        //Simple Exercise

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character, i will tell you is that an vowel");
       String alphabet = sc.next();
        //char userinput = sc.next().toCharArray()[0]: //we can use this for char]
        //if we using this statement instead "a" have to use 'a'

        switch (alphabet ){
            case  "a":
                System.out.println("Its an vowel");
                break;

            case "e":
                System.out.println("Its an vowel");
                break;

            case "i":
                System.out.println("Its an vowel");
                break;

            case "o":
                System.out.println("its an vowel");
                break;

            case "u":
                System.out.println("Its an vowel");
                break;

            default:
                System.out.println("Its not an vowel");

        }
    }
}
