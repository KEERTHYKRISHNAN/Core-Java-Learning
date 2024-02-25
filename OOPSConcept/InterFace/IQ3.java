package OOPSConcept.InterFace;

public class IQ3 {
    public static void main(String[] args) {
        System.out.println(h.a);
        System.out.println(h.b);
        keerthyy k = new keerthyy();
        k.m1();
        foo f = new foo();
        f.m1();
        f.sau();

        h kk = new foo(); // GF reference
        rofl r = new foo(); // father ref
        foo f1 = new foo(); // child ref


    }
}

interface H{
    int a = 10;
    int b =20;
    void m1();
}

class keerthyy implements h{

    @Override
    public void m1() {
        System.out.println("Im M1 function with a class");

    }
}

abstract class rofl implements h{
    abstract void sau();
}

class foo extends rofl{

    @Override
    public void m1() {
        System.out.println("Im m1");
    }

    @Override
    void sau() {
        System.out.println("Im sau");
    }
}