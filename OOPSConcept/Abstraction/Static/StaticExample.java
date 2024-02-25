package OOPSConcept.Abstraction.Static;

public class StaticExample {
    public static void main(String[] args) {
        P01 p1; // nothing will be called since object is not created
        P01.m2();
        P01 p = new P01();
        P01 p2 = new P01();
        P01.m2();
        P01 p03 = null;
        p03.m1();// you will get nullpointer exception becoz object is not created

        //SIB will be called once but IIB willbe called multipple times



    }

    }

    class P01 {


        int a = 10;
        static int b = 20;

        void m1() {
            System.out.println("M1");
            System.out.println(a);
            System.out.println(b);
        }

        static void m2() {
            System.out.println(b);
        }

        {
            System.out.println("IIB");
        }

        static {
            System.out.println("SIB");
        }
    }



