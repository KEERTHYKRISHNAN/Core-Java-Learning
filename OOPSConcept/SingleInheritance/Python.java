package OOPSConcept.SingleInheritance;

public class Python extends Programing {
    int version;
    String author;
    String changes;
    String configuration;

    Python(){
        System.out.println("Default constructor");
    }

    Python(int version, String author, String changes, String configuration){
        this.version = version;
        this.author = author;
        this.changes = changes;
        this.configuration = configuration;
        System.out.println("Param constructor");
    }

    void printinfo(){
        System.out.println("version - "+ this.version);
        System.out.println("author - "+ this.author);
        System.out.println("changes - "+ this.changes);
        System.out.println("Configuration - "+ this.configuration);
    }

}
