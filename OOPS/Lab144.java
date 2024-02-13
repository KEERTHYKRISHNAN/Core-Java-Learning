package OOPS;

public class Lab144 {
    public static void main(String[] args) {
        //String builder and string buffer - Mutable in nature

        StringBuilder sbd = new StringBuilder("Keerthy");
        sbd.append(" Krishnan");
        System.out.println(sbd);

        StringBuffer sbf = new StringBuffer("Trishan");
        sbf.append("VijayaKumar");
        System.out.println(sbf);

    }
}
