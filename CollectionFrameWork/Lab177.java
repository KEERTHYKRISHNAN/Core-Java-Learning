package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab177 {
    public static void main(String[] args) {
        List<String> courelist = new ArrayList<String>();
        courelist.add("LKG");
        courelist.add("UKG");
        courelist.add("Ist std");
        courelist.add("IInd Std");
        System.out.println(courelist);

        System.out.println("-- -- --");

        List numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        System.out.println(numlist);

        System.out.println("-- -- --");

        courelist.addAll(numlist);
        System.out.println(courelist);

        System.out.println("-- -- --");

        Iterator iterator = courelist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}