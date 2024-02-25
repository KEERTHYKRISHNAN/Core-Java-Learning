package OOPSConcept.Exceptions;

public class Lab164 {
    public static void main(String[] args) {
       try {
           String name = null;
           name.trim(); //result - a null pointer exception is throwed

       }catch (Exception e){
           System.out.println("you are trying to trim a null");
       }
        System.out.println("Im end !!");
    }
}

//using try catch mechanism