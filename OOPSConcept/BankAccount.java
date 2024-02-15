package OOPSConcept;

public class BankAccount {

    String bankname;
    String bankcode;
    int balance;

    BankAccount(){
        bankname = "SBI";
        bankcode = "SBI001";
        balance = 100000;
        System.out.println("Default constructor");
    }

    BankAccount(String bnkname, String bnkcode, int bal) {
        this.bankname = bnkname;
        this.bankcode = bnkcode;
        this.balance = bal;
        System.out.println("Param constructor");

    }
    void printdetails(){
        System.out.println("Bank name - " + bankname);
        System.out.println("Bank Code - " + bankcode);
        System.out.println("Balance - " + balance);
    }

}