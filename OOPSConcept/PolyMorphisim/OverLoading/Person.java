package OOPSConcept.PolyMorphisim.OverLoading;

public class Person {
        //Method Overloading
    //create multiple methods with differerent arugument

    String speak(String a){
        System.out.println("A is String" + a);
        return a;
    }

    void speak (int b){
        System.out.println("b iS an integer" + b);
    }

    void speak (float c){
        System.out.println("c is a float" + c);
    }
}
