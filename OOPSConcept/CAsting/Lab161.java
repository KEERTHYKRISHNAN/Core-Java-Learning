package OOPSConcept.CAsting;

public class Lab161 {
    //Upcasting and Downcasting in class
    public static void main(String[] args) {
        Parent p1 = new Parent();
        child c1 = new child();
        p1 = c1;
       // child = Parent;

        Parent p2 = new child();//UPcasting
        child c2 = (child)p2; //downcasting
        // we can do it forcefully, by accessing thr parent object


    }
}

class Parent{}
class child extends Parent{}


