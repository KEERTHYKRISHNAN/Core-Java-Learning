package OOPSConcept.InterFace;

interface Father {
    void loan1k();

    default void print(){
        System.out.println("Im a default method");
    }

    static void print1(){
        System.out.println("Im a static print method");
    }

    }

