package OOPSConcept;

public class Lab148Person {
    public static void main(String[] args) {


//    Person p = new Person();
//        System.out.println(p.name);
//        //the result will be null, because its an default value
//        System.out.println(p.age);
//        System.out.println(p.email);
//        System.out.println(p.phonenumber);
//        p.printdetails();

        Person p = new Person(); //default constructor will be created
        p.coursename = "ATB";
        p.printdetails();

        Person p2 = new Person("Keerthy");
        p2.printdetails();

}
}