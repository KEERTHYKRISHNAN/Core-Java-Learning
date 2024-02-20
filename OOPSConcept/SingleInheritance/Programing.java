package OOPSConcept.SingleInheritance;

public class Programing {

    int version;
    String author;

    Programing(){
        System.out.println("Default constructor");
    }

    Programing(int version, String author){
        this.version = version;
        this.author = author;
        System.out.println("Param constructor");
    }

    void printdetails(){
        System.out.println("Program info - " + this.version + "Author - " + this.author);
    }

    }

