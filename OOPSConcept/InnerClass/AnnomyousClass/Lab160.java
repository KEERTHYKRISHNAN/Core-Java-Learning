package OOPSConcept.InnerClass.AnnomyousClass;

public class Lab160 {
    public static void main(String[] args) {
        student s1 = new student() {
            @Override
            public void setID() {

            }
        };  //no name class is created, so overide function is implemented
        //no nmae class is created by creating a object
        s1.setID(); // after creating a obect now its able to access  the setid function

        noname s2 = new noname();
        s2.setID();

        b b1 = new b() { // we can create an object for abstract class, with the overide functionality
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}


abstract class b{
    int var_b = 20;
}

interface student {
    int id  = 11;
    void setID();
}

class noname implements student{

    @Override
    public void setID() {
        System.out.println("Im a interface function");
    }
}
