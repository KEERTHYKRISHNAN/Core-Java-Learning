package OOPSConcept.Exceptions;

public class Lab166 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);

        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //also we can use it for multiple catch exception
        }
        finally {
            System.out.println("Anyhow i will execute the code");
        }
    }
}