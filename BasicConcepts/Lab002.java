package BasicConcepts;

public class Lab002 {
    public static void main(String[] args) {
        // range of byte = -128 to 127
        byte age = 10;
      //  age = 129;  // incompatible becoz its out of range
        age = 127;
        System.out.println(age);
        System.out.println(age+5);
        System.out.println(age-10);

    }
}
