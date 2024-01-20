package Operators;

public class Lab046 {
    public static void main(String[] args) {
        // Ternary Operator --> Min and Max
        int a = 10;
        int b = 20;
        int max = a>b ? a:b;
        int min = a<b ? b:a ;
        System.out.println(max);
        System.out.println(min);
    }
}
