package OOPS;

public class Lab129 {
    public static void main(String[] args) {

      int d =  main(70);
        System.out.println(d);

        main("Keerthy");

    }

    static void main (String a){
        System.out.println("I'm a main function, but JVM doesnt recognise me");
    }

     static int main (int a){
         return 101;
     }



}
