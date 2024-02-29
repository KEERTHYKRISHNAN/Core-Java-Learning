package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        // if we add<integer> or <String> it will restrict
        List<Integer> mylist = new ArrayList<>();
       // mylist.add("Pramod"); nongeneric
        mylist.add(123); //Generic
       // mylist.add(true);
        System.out.println(mylist);
    }
}
