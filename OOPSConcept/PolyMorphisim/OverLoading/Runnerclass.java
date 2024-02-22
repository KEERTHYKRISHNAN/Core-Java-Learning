package OOPSConcept.PolyMorphisim.OverLoading;

public class Runnerclass {
    public static void main(String[] args) {
        new Person().speak(55);
        new Person().speak("Keerthy");
        new Person().speak(3.75f);
    }
}
