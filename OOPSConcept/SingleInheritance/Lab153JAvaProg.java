package OOPSConcept.SingleInheritance;

public class Lab153JAvaProg {
    public static void main(String[] args) {
//        Java j = new Java();
//        Programing p = new Programing();
//        Programing p2 = new Java();
//        //Java j2 = new Programing(); // child ref cannot access parent object
//
//        System.out.println("-- -- -- --");

        Python py = new Python();
        Python p3 = new Python(12, "Keerthy", "kert12", "Lowercase");
        p3.printinfo();




    }
}
