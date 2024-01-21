package Operators;

public class Lab047 {
    public static void main(String[] args) {
        // Ternary Operator --> simple exercise

        int a = 40;
        int b = 30;
        int c = 50;
        int max = (a>b) ? ((a>c)? a:c):((b>c)? b:c);
        System.out.println(max);
    }
}
