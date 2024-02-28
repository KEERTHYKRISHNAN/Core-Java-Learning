package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab176 {
    public static void main(String[] args) {
        //VectorList - Enumeration is available only for vector

        Vector vector = new Vector();
        vector.add("Keerthy");
        vector.add("123");
        vector.add("Trishan");
        System.out.println(vector);

        System.out.println("-- -- -- --");

//        for (int i = 0; i < vector.size(); i++) {
//            System.out.println(i);
//        }
        System.out.println("-- -- -- -- ");

        Enumeration e = vector.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
