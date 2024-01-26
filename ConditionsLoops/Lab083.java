package ConditionsLoops;

public class Lab083 {
    public static void main(String[] args) {

        System.out.println("Print the value if i, but need to break when i=5");
        for (int i = 1; i <= 10; i++) {

            if (i == 5){
                break;


            }
            System.out.println("value of " + i);
            //if we move tis conditon above the i==5, it will print till the values of 5;
            //since we printing after the condition it will print till value of 4
        }

    }
}