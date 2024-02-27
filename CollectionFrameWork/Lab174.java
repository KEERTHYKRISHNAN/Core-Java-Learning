package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Lab174 {
    public static void main(String[] args) {

        //to retrict the datatype use<>
        List <String> mylist = new ArrayList<>();

        mylist.add("Pramod");
//        mylist.add(123);
//        mylist.add(true);
        System.out.println(mylist);
        mylist.set(0,"Keerthy");
        System.out.println(mylist);
        mylist.remove( "Pramod");
        System.out.println(mylist);

        System.out.println("-- -- -- --");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(i);
        }
        System.out.println("-- -- -- --");

        for (String  o: mylist){
            System.out.println(o);
        }
    }
}
