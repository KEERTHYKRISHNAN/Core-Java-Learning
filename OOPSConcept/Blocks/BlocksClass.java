package OOPSConcept.Blocks;

public class BlocksClass {
    {
        System.out.println("Im a IIB"); //Instance Initialization Block
    }

    static {
        System.out.println("Im a SIB"); // Static Initialization Block
    }

    BlocksClass(){
        System.out.println("Default constructor");
    }
}
