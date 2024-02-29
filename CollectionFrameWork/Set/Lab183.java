package CollectionFrameWork.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab183 {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);
    }
}
