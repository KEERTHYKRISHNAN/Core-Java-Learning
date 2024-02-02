package OOPS;

public class Lab127 {

    //Multiple main function with different argument

    public static void main(String[] args) {
        System.out.println(args);
    }

    public static void main (int a){
        System.out.println("Another main");
    }

    public static int main (int a, int c, int d){
        return 99;
    }
}
