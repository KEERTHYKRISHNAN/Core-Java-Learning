package OOPSConcept.Abstraction.Static;

public class StaticKeywordRunnerClass {
    public static void main(String[] args) {
        System.out.println(StaticKeyword.Collegename);
        StaticKeyword.printinfo();

        System.out.println("-- -- -- -- --");

        StaticKeyword s1 = new StaticKeyword();
        StaticKeyword.Collegename = "Keerthy";
        s1.version = 33;
        s1.printinfo1();
        StaticKeyword.printinfo();

    }
}
