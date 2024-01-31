package Arrays;

public class Lab118 {
    public static void main(String[] args) {
        //Fizzbuzz Problem
        //Write a Program that prints 1-100
        //for multiples of 3, print fizz
        //for multiples og 5, print buzz
        //for numbers both multiples of 3 and 5 , print Fizzbuzz

        for (int i = 1; i <=100 ; i++) {
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz" + i);
            } else if (i%3 == 0) {
                System.out.println("Fizz" +i);
            } else if (i%5 ==0) {
                System.out.println("Buzz" + i);

            }else System.out.println(i);

        }
        System.out.println("--end of the program--");
    }
}
