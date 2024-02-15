package OOPSConcept;

public class Lab149BankAccount {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printdetails();

        System.out.println("-- -- -- -- --");

        BankAccount HDFC = new BankAccount("HDFC", "HDFC001", 1000);
        HDFC.printdetails();

        System.out.println("-- -- -- -- --");

        BankAccount ICIC = new BankAccount("ICIC", "ICIC001",500);
        ICIC.printdetails();

    }
}
