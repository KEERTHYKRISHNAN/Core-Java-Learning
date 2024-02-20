package OOPSConcept.MultiLevelInheritance;

public class Lab154 {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        g.gf();

        System.out.println("-- -- -- --");

        Father f = new Father();
        f.fa();
        f.gf();

        System.out.println("-- -- -- --");

        Son s = new Son();
        s.sn();
        s.fa();
        s.gf();

        System.out.println("-- -- -- --");

        Grandfather g1 = new Father();
        Father f1 = new Son();
        //Son s1 = new Father(); cannot access the parernt object;
        //Father f2 = new Grandfather(); cannot access the parent object
        Grandfather g4 = new Son();

    }
}
