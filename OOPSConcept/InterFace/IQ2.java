package OOPSConcept.InterFace;

public class IQ2 {
    public static void main(String[] args) {
        System.out.println(h.a);
        //interface variables are static. not necessary to create object,
        //without creating an object we can call in sout statement
       keerthy k = new keerthy();
       k.m1();

    }
}


interface h{
    int a = 10;
    int b = 20;
    void m1();
}
class keerthy implements h{

    @Override
    public void m1() {

    }
}
