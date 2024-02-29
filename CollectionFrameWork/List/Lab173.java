package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class Lab173 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);
        mylist.set(2,"Keerthy");
        System.out.println(mylist);
        mylist.remove("Pramod");
        System.out.println(mylist);

        System.out.println("-- -- -- --");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(i);
        }
        System.out.println("-- -- -- --");

        for (Object o: mylist){
            System.out.println(o);
        }
    }
}
