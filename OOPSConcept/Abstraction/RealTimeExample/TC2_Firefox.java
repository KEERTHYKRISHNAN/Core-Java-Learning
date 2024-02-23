package OOPSConcept.Abstraction.RealTimeExample;

public class TC2_Firefox extends BaseClass{
    @Override
    String OpenBrowser() {
        System.out.println("Starting Firefox");
        return null;
    }

    @Override
    String CloseBrowser() {
        System.out.println("Closing Firefox");
        return null;
    }
}
