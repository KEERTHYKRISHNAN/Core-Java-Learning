package OOPSConcept.Exceptions;

public class Lab171 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 1;
        int d = 0;
        try{
            d = a/b;
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println("Keerthy error");
        }

            d = a/c;
            System.out.println(d);
        try{
            d = a/b;
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println("duplicate error");
        }
        d = a+c;
        System.out.println(d);

    }
}
