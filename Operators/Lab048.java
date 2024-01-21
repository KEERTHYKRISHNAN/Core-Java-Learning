package Operators;

public class Lab048 {
    public static void main(String[] args) {
        // Ternary Operator ---> simple excersise

        int a = 50;
        int b = 20;
        int c = 17;
        int max = (a>b) ? ((a>c) ? a:c) : ((b<c) ? b:c);
        System.out.println(max);
        int min = (a<b) ? ((a<c) ? a:c) : (b<c ? b:c);
        System.out.println(min);
    }
}
