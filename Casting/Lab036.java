package Casting;

public class Lab036 {
    public static void main(String[] args) {

        // Explicit Casting
        int a = 30;

        byte b = (byte)a;
        //byte b = a ---> invalid implicit casting
        System.out.println(b);

        int c = 300;
        byte d = (byte)c;
        System.out.println(d);
        // int a=300; -> int means 32 bits memory required
        //0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        //byte b1=(byte)a; -> byte means 8 bits memory required
        //0 0 1 0 1 1 0 0
        //Value is
        //0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
        //0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44.
    }
}
