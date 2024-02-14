package OOPSConcept;

public class Person {
    //Attribute - instance variable assigned under p - they are default
    String name;
    int age;
    String email;
    Long phonenumber;
    Double heightweight;
    String address;
    String coursename;





    //Behaviour
    void walk (){
        System.out.println("walk");
    }

    void sleep () {
        System.out.println("sleep");
    }

    boolean result = true;

    void printdetails(){
        System.out.println(name);
        System.out.println(this.coursename);
    }

    Person(){
       coursename = "ATB";
        System.out.println("Im called!!!!");
   }

    //Parameterized constructor

    Person(String Valuefromobjectref) {
        this.name = Valuefromobjectref;

    }

}
