package Operators;

public class Lab024 {
    public static void main(String[] args) {
        // Overall Output is String

        int a = 10;
        int b = 20;
        String name = "Keerthy";
        System.out.println(a+name);
        System.out.println(name+a);


        System.out.println(a+b+name);
        // the values are being adding (sum) to left to right
        //only for string "concatenation happens
        //so a+b is sum (adding) + concate occurs

        System.out.println(name+a+b);
        //all the + acts concate becoz its starts with (string+a)+b
    }
}
