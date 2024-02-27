package OOPSConcept.Exceptions;

public class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
        System.out.println("Custom Exception!!");
    }
}
