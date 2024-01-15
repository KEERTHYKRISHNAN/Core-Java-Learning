package Operators;

public class Lab026 {

    public static void main(String[] args) {

        //Relational Operators


        int age_Keerthy = 27;
        int age_Keerthy2 = 29;
        boolean result = age_Keerthy2 > age_Keerthy;
        System.out.println(result);

        boolean result2 = age_Keerthy > age_Keerthy2;
        System.out.println(result2);

        int a = 10;
        int b = 10;
        boolean result3 = (a == b);
        System.out.println(result3);

        boolean result4 = (a>b);
        System.out.println(result4);

        boolean result5 = (a>=b); //OR condition
        System.out.println(result5);

        boolean result6 = (a<=b); //OR condition
        System.out.println(result6);
    }
}
