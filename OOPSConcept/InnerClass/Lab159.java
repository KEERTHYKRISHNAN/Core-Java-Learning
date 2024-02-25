package OOPSConcept.InnerClass;

public class Lab159 {
    public static void main(String[] args) {


        Vijay v = new Vijay();
        Vijay.Vijaykumar vj = v.new Vijaykumar();
        vj.eating();

    }
}

class Vijay{
    int age = 30;
    void eat(){
        System.out.println("Im eating");
    }

    class Vijaykumar{
        void eating(){
            System.out.println("Im eating");
        }
    }
}
