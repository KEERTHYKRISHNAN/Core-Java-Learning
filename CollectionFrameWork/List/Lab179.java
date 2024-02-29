package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {
        //Sorting the values // collections.sort function

        List<Integer> marks = new ArrayList<>();
        marks.add(91);
        marks.add(92);
        marks.add(93);
        marks.add(95);
        marks.add(96);


        // to sort the marks
        Collections.sort(marks);
        System.out.println(marks);
    }
}
