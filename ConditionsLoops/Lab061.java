package ConditionsLoops;

import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {

        //Write a program that calculates and display the letters
        //numerical score based on the grading scale
        // A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >90 && score <= 100){
            System.out.println("Your score is  --> A");
        }else if (score >80 && score <=89){
            System.out.println("Your score is --> B");
        }else if (score >70 && score <= 79){
            System.out.println("Your score is ---> C");
        }else if (score <60 && score >= 69){
            System.out.println("Your score is ---> D");
        }else {
            System.out.println("your score is --> F");
        }
    }
}
