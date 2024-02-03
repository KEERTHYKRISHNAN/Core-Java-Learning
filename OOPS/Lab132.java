package OOPS;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {



    //Swapping the values

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;


        System.out.println("The values of a,b" + " " + a +" " + b);


}
}