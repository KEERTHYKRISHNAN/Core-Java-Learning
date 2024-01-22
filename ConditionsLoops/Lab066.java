package ConditionsLoops;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {
        //Simple Exercise - with only if condition
        //Square classifier Program

        //give 4 input values representing the length of the sides
        // if square is All sides are equal
        //isosceles -exactly two sides are equal
        //scalene -no sides are equal
        //use an if else statement to classify the square

        //side 1 = side2 = side 3  --> square
        //side 1 = side 2, side 2 = side 3    --> isosceles
        //scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int side4 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3) && (side3 == side4) && (side4 == side1)) {
            System.out.println("Its a Square");
        }
        if ((side1 == side2) || (side2 == side3) || (side3 == side4) || (side4 == side1)) {
            System.out.println("Only 2 sides are equal");
        }
        if ((side1 == side2) != (side2 == side3) != (side3 == side4) != (side4 == side1)) {
            System.out.println("Its not an square - its a Scalene");
        }
    }
}
