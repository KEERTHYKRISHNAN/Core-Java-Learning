package ConditionsLoops;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        //simple exercise

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser name, I will execute the browser");
        String browser = sc.next();

        switch (browser.toLowerCase()){
            case  "Chrome":
                System.out.println("Execute the chrome code");
                break;

            case  "Firefox":
                System.out.println("Execute the Firefox code");
                break;

            case "Edge":
                System.out.println("Execute the Edge code");
                break;

            case "Opera":
                System.out.println("Execute the code");
                break;

            default:
                System.out.println("I have no Idea, what browser it is");
        }
    }
}
