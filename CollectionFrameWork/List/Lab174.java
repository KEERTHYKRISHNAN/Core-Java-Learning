package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab174 {
    public static void main(String[] args) {

        //ArrayList<>

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

        //For Loop

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(i);
        }
        System.out.println("-- -- -- --");

        //for eachloop

        for (String  o: mylist){
            System.out.println(o);
        }

        System.out.println("-- -- -- --");

        //Iterator Method
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
