package Operators;

public class Lab050 {
    public static void main(String[] args) {
        //Increment Operator
        int a = 10;
        System.out.println(++a + a++ + a++);

        //Part A - ++a --> (exp =11  a =11  o/p=11 )
        //Part B-  a++ --> (exp =11  a =12  o/p=11 )
        //Part C-  a++ --> (exp =12  a =13  o/p=12 )
    }
}
