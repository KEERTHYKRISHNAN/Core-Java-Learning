package Arrays;

import java.util.Scanner;

public class Lab116 {
    public static void main(String[] args) {
        //user input and print the statement

        Scanner sc = new Scanner(System.in);
        int[]  marks = new int [5];

        System.out.println("Enter the first Subject");
         marks [0] = sc.nextInt();
        System.out.println("Enter the Second Subject");
        marks [1] = sc.nextInt();
        System.out.println("Enter the third Subject");
        marks [2] = sc.nextInt();
        System.out.println("Enter the fourth Subject");
        marks [3] = sc.nextInt();
        System.out.println("Enter the fifth Subject");
        marks [4] = sc.nextInt();

        System.out.println("------*******------");

        for (int i = 0; i < marks.length ; i++) {
            if (marks[i]<30){
                System.out.println("You are fail in this subject" + marks[i]);
            }
            System.out.println(marks[i]);

        }
       sc.close();

    }

}
