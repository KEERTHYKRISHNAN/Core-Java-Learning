package CollectionFrameWork;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab178 {
    public static void main(String[] args) {
        //ListIterator

        List TestingCourse = new ArrayList();
        TestingCourse.add("LKG");
        TestingCourse.add("UKG");
        TestingCourse.add("ISt STD");
        System.out.println(TestingCourse);

        ListIterator LTE = TestingCourse.listIterator(TestingCourse.size());
        while (LTE.hasPrevious()) {
            System.out.println(LTE.previous());
        }
    }
}