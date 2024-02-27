package OOPSConcept.Exceptions;

public class Lab168 {
    public static void main(String[] args) throws Exception{
        extracted(0);
        throw new Exception("Error");
    }

    private static void extracted(int b) {
//        int a;
//        if (b == 0){
//        throw new ArithmeticException("B cant be zero");
//        }else {
//             a = 0/b;
//        }
//
//        System.out.println(a);

        try {
            int a = 10/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
   }


}

