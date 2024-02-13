package OOPSBasics;

import java.util.Scanner;

public class Lab134 {
    //swapping the values also using try catch exception


    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a = sc.nextInt();

            System.out.println("Enter the value of b");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;


            System.out.println("The value of a is " + a);
            System.out.println("The value of b is " + b);

        } catch (Exception e ){
            System.out.println("Not possible zero");
        }
    }
}
