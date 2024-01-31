package Arrays;

public class Lab113 {
    public static void main(String[] args) {
        //using for loop

        int [] marks = {96,95,94,93,92};
       // System.out.println(marks);// it will print the reference location for marks

        System.out.println(marks [0]);
        System.out.println(marks [1]);
        System.out.println(marks [2]);
        System.out.println(marks [3]);

        System.out.println("-------------");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);

            //for (int i = 0; i <= marks.length-1 ; i++) {
              //  System.out.println(marks[i]);
            //if we are using the <= the length should be -1
            //this is not preferable

        }


    }
}
