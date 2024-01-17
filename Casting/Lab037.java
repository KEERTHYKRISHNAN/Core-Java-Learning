package Casting;

public class Lab037 {

    public static void main(String[] args) {
        int a = 300;
        float b = (int)a;
        System.out.println(b);

      //int c = 10000;
       //float g = 0.1845f;
       //int total  =  c+ (int)g*c;
       // System.out.println(total); // result is 10000
        // if we use the int , we will lose the values since the int is small than float

        int c =10000;
        float g = 0.1845f;
        float total = c+g*c;
        System.out.println(total); //result is 11845.0
        // float is bigger than int so we using to caluculate the total with float
    }
}
