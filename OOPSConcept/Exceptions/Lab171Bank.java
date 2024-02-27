package OOPSConcept.Exceptions;

public class Lab171Bank {
    public static void main(String[] args) throws CustomException {

        Bank JP = new Bank("USD", 100);
        Bank HDFC = new Bank("INR" , 100);
        Bank ICIC = new Bank("INR" , 100);
       System.out.println(HDFC.add(JP)); //custom exception
        System.out.println(ICIC.add(HDFC));
        System.out.println(HDFC.add(ICIC));
    }
}
