package OOPSBasics;

public class Lab123 {
    public static void main(String[] args) {

        int a = sum (5,10);// 5,10 are arguments
        int b = sum (5);
        int c = sum(); //No Arguments
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sayhello();//call to the function

    }

    static int sum(int input1, int input2){ //input 1,2 are definition of the function
        return input1 + input2;
    }

    static int sum (int input1){
        return input1;
    }

    static int sum (){
        return 99;

    }
    static int sum (int input1, int input2, int c){
        return input1 + input2+ c;

    }

    static void sayhello(){
        System.out.println("Yes");
    }
}
