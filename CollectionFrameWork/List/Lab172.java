package CollectionFrameWork.List;

import java.util.List;

public class Lab172 {
    public static void main(String[] args) {
        List fruits = List.of("Orange", "Apple", "Banana");
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.isEmpty());
    }
}
