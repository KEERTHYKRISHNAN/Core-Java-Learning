package CollectionFrameWork.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab182 {
    public static void main(String[] args) {
        //HashSet

        Set<String> fruits = new HashSet();
        fruits.add("Orange");
        fruits.add("apple");
       fruits.add("Banana");
       fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("apple"));

        System.out.println("-- -- -- -- -- --");

        System.out.println(fruits);
        for (Object o:fruits){
            System.out.println(o);
        }

        System.out.println("-- -- -- -- -- --");

        Iterator ite = fruits.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }



    }
}
