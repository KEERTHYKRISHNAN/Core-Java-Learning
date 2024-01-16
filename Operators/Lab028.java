package Operators;

public class Lab028 {
    public static void main(String[] args) {
        byte b = 66;
        byte c = 65;

        System.out.println('A' == b);
        // the result will be false becoz the ASCII value of 'A' is 65

        System.out.println('A' == c);
        // the result will be True becoz the ASCII value of 'A' is 65

        System.out.println('A' == 65.0);
        // result will be true ...the float will be changed to integer in sop statement
            // this is a property of java

        System.out.println('A' == 65.2);// will be false
    }
}
