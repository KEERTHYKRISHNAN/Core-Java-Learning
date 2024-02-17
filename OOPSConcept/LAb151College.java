package OOPSConcept;

import java.util.Scanner;

public class LAb151College {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the College");
        String coll_name = sc.next();

        College c1 = new College();
        c1.printdetail();


        System.out.println("-- -- -- -- --");


        sc.close();
    }
}
