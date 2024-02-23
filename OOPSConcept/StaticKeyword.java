package OOPSConcept;

public class StaticKeyword {

    //StaticVariable
    public static String Collegename = "TestingAcademy";
    //College name act as global variable


    //NonStatic variable
    public int version = 10;

    //StaticMethod

    public static void printinfo() {
        System.out.println("name is " + Collegename);
        //You cant have instance variable in static method
    }

    //Non Static Method
    public void printinfo1() {
        System.out.println("name is " + Collegename);
        System.out.println("Version is " + version);

    }

}