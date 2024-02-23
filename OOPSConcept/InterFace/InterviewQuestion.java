package OOPSConcept.InterFace;

public class InterviewQuestion {
    public static void main(String[] args) {

    }

    interface I1 {
    }

    interface I2 {
    }

    class A {
    }

    class B {
    }

    abstract class C{}
    abstract class D{}

    class test1 extends A{}
    //class test2 extends A,B {}//cannot extend multiple class

    class test3 implements I1{}
    class test4 implements I1, I2{}// can extend multiple class for interface with implement keyword

    class test5 extends A implements I1,I2{}
    //Implement word should be the last one , ie if we using the keyword extends, then the implement word is used

  //  interface I2 extends  A{}//interface cannot extends

    //for an interface constructor is not possible





}