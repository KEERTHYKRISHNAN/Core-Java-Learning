package BasicConcepts;

public class Lab020 {
    public static void main(String[] args) {

        // character examples - escape sequence

        char a = '\n';   // new line
        char b = '\t';   // includes space (tab)
        System.out.println("My name is Keerthy" + b + "Krishnan");

        System.out.println();

        System.out.println("My name is Keerthy" + a + "Krishnan");

        System.out.println();

        char c = '\b';  // backlash (deletes a 1 character)
        System.out.println("Keerthy" + c + "Krishnan");

        System.out.println();

        char d = '\r';
        System.out.println("Keerthy" + d + "Krishnan");  //deletes the 1st charcter

        System.out.println("Keerthy\"Krishnan");
        System.out.println("Keerthy\'Krishnan");


    }
}
