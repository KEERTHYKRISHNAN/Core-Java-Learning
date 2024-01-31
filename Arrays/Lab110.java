package Arrays;

public class Lab110 {
    public static void main(String[] args) {
        //Arrays - collection of data which has similar type
        //stored in contiguous memory location

        //index counting starts from 0
        //length starts from 1

        //We are taking 10the marks {96,90,75,85,65}

        int a = 10;
        int [] marks = {96,90,75,85,65};
        //int [] marks_11 = {70, 70.5, 96.4l,45}// only similar type of data will stored
        // double or float cannot be stored inbetween the other type arrays
        //it should be as same

       System.out.println(marks); // it will print the reference location of marks
        System.out.println(marks.length);
        System.out.println(marks [3]);
      //  System.out.println(marks [6]);//shows exception in thread
    }
}
