package OOPS;

public class Lab140 {
    public static void main(String[] args) {
        //String constant pool and Heap area

        String str1 = "Keerthy"; //strores in scp
        String str2 = new String("Krishnan"); //new string always stores in Heap/Object area
        String str3 = new String(str1.concat("Trishan"));
       // System.out.println(str2);
       // System.out.println(str3);
        String str1new = new String("Krishan");
        System.out.println(str1new);

        System.out.println(str1new.contains("h "));
    }
}
