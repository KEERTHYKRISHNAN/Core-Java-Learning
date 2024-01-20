package Operators;

public class Lab043 {
    public static void main(String[] args) {

   // Simple Exercise
    String name = "Keerthy Krishnan";
    String name1 = "Keerthy Krishnan";
    String name2 = new String("Keerthy Krishnan");
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 .equals(name2));

        String name3 = new String("Keerthy krishnan");
        System.out.println(name2 .equalsIgnoreCase(name3));


}
}
