package OOPSConcept.SingleInheritance;

public class LAb152Java {
    public static void main(String[] args) {


        Programing p = new Programing();
        p.printdetails();
        // Programing = Class
        //p = ref varibale
        //new Programing object, DC is called

        System.out.println("-- -- -- --");

        Programing p2 = new Programing(12, "Trishan");
        p2.printdetails();
    }
}