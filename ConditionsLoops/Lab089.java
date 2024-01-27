package ConditionsLoops;

public class Lab089 {
    public static void main(String[] args) {
        //simple Exercise
        //Print the odd number

       // for (int i = 50; i >0 ; i--) {
         //   if (!(i%2 ==1)){
          //      System.out.println(i  + " is even");
           // } this program will print in the reverse starts from 50 to 1

       // }

        for (int i = 1; i <=50 ; i++) {
          if(i%2 ==1)  {
              System.out.println(i +" is odd");
          }
        }

    }

}
