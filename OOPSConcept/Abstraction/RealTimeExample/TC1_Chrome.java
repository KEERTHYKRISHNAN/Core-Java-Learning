package OOPSConcept.Abstraction.RealTimeExample;

public class TC1_Chrome extends BaseClass{

    //Parentclass is forcing some functions with child class with the abstraction
    @Override
    String OpenBrowser() {
        System.out.println("Starting Chrome");
        return null;
    }

    @Override
    String CloseBrowser() {
        System.out.println("Closing Chrome");
        return null;
    }
}
