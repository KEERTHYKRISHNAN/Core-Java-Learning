package OOPSConcept.PolyMorphisim.OverRiding;

public class RunnerClass {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.bark();

        Puppy c = new Puppy();
        c.bark();

        Dog b = new Puppy();
        b.bark();




    }
}
