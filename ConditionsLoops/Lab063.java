package ConditionsLoops;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
        //Triangle classifier Program

        //give three input values representing the length of the sides
        // if triangle is equilateral (All sides are equal)
        //isosceles (exactly two sides are equal)
        //scalene (no sides are equal)
        //use an if else statement to classify the triangle

        //side 1 = side2 = side 3  --> eqilateral
        //side 1 = side 2, side 2 = side 3    --> isosceles
        //scalene

        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3) && (side3 == side1)) {
            System.out.println("Equilateral Triangle");
        }else if ((side1 == side2) || (side2 == side3) || (side3 ==side1)){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene");
        }


        }
}
