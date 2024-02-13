package OOPSBasics;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        //Palindrome Problem
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String userinput = sc.next();
        boolean result = Ispalindrome(userinput);
        if (result){
            System.out.println("Its an Palindrome");
        }else System.out.println("Its not a Palindrome");
    }

    private static boolean Ispalindrome(String userinput) {
        String originalstr = userinput;
        StringBuilder sb = new StringBuilder(userinput);
        sb.reverse();
        return originalstr.equalsIgnoreCase(sb.toString());
    }
}
