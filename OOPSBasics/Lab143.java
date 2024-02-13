package OOPSBasics;

public class Lab143 {
    public static void main(String[] args) {
        String str1 = "Keerthy";
        String str2 = new String("Keerthy");
        System.out.println(str1 == str2);

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str2));
    }
}
