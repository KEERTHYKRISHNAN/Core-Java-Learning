package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab181Student {
    public static void main(String[] args) {
        Student s1 = new Student("Keerthy" , 05);
        Student s2 = new Student("Vijay" , 02);
        Student s3 = new Student("Trishan" , 01);

        List <Student> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        System.out.println(stud);

        System.out.println("-- -- -- --");

       // Collections.sort(stud);
        Collections.sort(stud, new sortbyname());
        Collections.sort(stud, new asc());

        System.out.println(stud);

    }
}
