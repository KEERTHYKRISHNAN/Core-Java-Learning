package Operators;

public class Lab033 {

    public static void main(String[] args) {
        // Relational and Logical Operator

        int a = 20;
        boolean b = (a>10 || a<30);
        System.out.println(b);

        boolean c = (a>30 || a<10);
        System.out.println(c);

        boolean d = (a>50 || a<1);
        System.out.println(d);

        boolean e = !(a>50 || a<1);
        System.out.println(e);
    }
}
