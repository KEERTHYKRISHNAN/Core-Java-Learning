package OOPSConcept.Inheritance;

public class Java extends Programing {
    String features;
    int version1;

    Java(){
        System.out.println("Default constructor");
    }

    Java(String features, int version1){
        this.features = features;
        this.version1 = version1;
        System.out.println("Param Constructor");
    }

    void printinfo(){
        System.out.println("Child information");
    }


}
