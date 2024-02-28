package CollectionFrameWork;

import java.util.Stack;

public class Lab180 {
    public static void main(String[] args) {
        //Stack - Legacy class - Lastin Firstout

        Stack stk = new Stack<>();
        stk.push("Keerthy");
        stk.push("Vijay");
        stk.push("Trishan");
        stk.push(123);
        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk);

    }
}
