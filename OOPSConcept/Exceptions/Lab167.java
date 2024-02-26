package OOPSConcept.Exceptions;

public class Lab167 {

    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);

        } catch (Exception e){
            System.out.println(e.getMessage());
            //we can use the exception e for the error message if we are using any exception
        }
    }
}
