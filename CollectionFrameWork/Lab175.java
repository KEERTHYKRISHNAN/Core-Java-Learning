package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab175 {
    public static void main(String[] args) {
        //LinkedList

        List<String> mylist = new LinkedList<String>();
        mylist.add("Keerthy");
        mylist.add("Vijay");
        mylist.add("Trishan");
        mylist.add("Lakshan");
        System.out.println(mylist);

        System.out.println("-- -- -- --");

        List<Integer> listint = new LinkedList<Integer>();
        listint.add(123);
        listint.add(456);
        listint.add(789);
        System.out.println(listint);

        System.out.println("--- -- -- -- ");

        Iterator iterator = listint.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
