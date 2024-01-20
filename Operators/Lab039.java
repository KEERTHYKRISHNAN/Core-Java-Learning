package Operators;

public class Lab039 {
    public static void main(String[] args) {
        // New Operator
        //is used to create new object for class
        String s1 = "Keerthy";
        // tis is created in String constant pool

        String s2 = new String("Keerthy");
        //it returns the address of new created object

        System.out.println(s2);
        System.out.println(new String ("Keerthy"));


        //S1 == S2, references are not equal since s1 is created in SCP and S2 is created in object area
        //== operator is used for comparison
        //S1 .equals S2 - values are equal
    }
}
