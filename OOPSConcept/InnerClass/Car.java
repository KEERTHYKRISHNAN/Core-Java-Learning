package OOPSConcept.InnerClass;

public class Car {
    public static void main(String[] args) {
        car c = new car("Volkwagen");
        c.drive();
        car.Engine e = c.new Engine("Volkswagen", "bree");
        c.drive();

    }
}

class car{
    String make;

    //Param cons:
    public car(String make){
        this.make = make;
    }
    //Method:
    void drive(){
        System.out.println("Yu can drive car");
    }

    //Creating a inner class
    public class Engine{
        String make;
        String breakk;

        public Engine(String make, String breakk){
            this.make = make;
            this.breakk = breakk;
        }
    }
}
