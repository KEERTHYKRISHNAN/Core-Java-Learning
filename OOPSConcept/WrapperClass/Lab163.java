package OOPSConcept.WrapperClass;

public class Lab163 {
    public static void main(String[] args) {
        int x = 133;
        String st1 = x + "";  // concatenation is possible
        String s1 = String.valueOf(x);
        System.out.println(x);

        Integer x2 = Integer.valueOf(x);

        Character ch = 'x';
        char a3 = ch;
        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(30,35));

    }
}
