package OOPSConcept.InterFace;

public class son implements Father {


    @Override
    public void loan1k() {
        System.out.println("Loan");
    }

    @Override
    public void print() {
        Father.super.print();
    }
}
