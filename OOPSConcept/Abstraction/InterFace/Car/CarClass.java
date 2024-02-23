package OOPSConcept.Abstraction.InterFace.Car;

public class CarClass implements Engine, Break {
    void start(){
        System.out.println("Im starting car");
        startengine();
        Breaks();
    }

    @Override
    public void startengine() {
        System.out.println("StartEngine");
    }

    @Override
    public void Breaks() {
        System.out.println("Im breaking!!");
    }
}
