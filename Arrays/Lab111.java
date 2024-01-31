package Arrays;

public class Lab111 {
    public static void main(String[] args) {

        String [] groceries = {"butter", "milk", "salt" , "apple"};
        System.out.println(groceries.length);
        System.out.println(groceries [0]);
        System.out.println(groceries [1]);
        System.out.println(groceries [2]);
        System.out.println(groceries [3]);
        //System.out.println(groceries [4]);//shows execption

        int[] a = new int [4];
        //it considers default value of  a--> [0,0,0,0]
//        System.out.println(a [0]);
//        System.out.println(a [1]);
//        System.out.println(a [2]);
//        System.out.println(a [3]);

        // of assigning the value

        a[0] = 70;
        a[1] = 60;
        a[2] = 50;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

    final int [] b = new int [4];
    //b --> 0.0.0.0
        //after assigning the final value also we can change

        b[0]=70;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);



    }
}
