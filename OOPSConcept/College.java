package OOPSConcept;

public class College {
    String studentname;
    int age;
    String emailid;
    double marks;

    College(){
        studentname = "Keerthy";
        age = 20;
        emailid = "keerthy310595@gmail.com";
        marks = 80.95;
        System.out.println("Default constructor");
    }


    College(String name, String mail, double mrk, int agge){
       this.marks = mrk;
        this.studentname = name;
       this.age = agge;
        this.emailid = mail;
        System.out.println("Param Constructor");
    }

    void printdetail(){
        System.out.println("Student name  - "+ studentname);
        System.out.println("Age - " + age);
        System.out.println("EmailID - " + emailid);
        System.out.println("Marks - " + marks);
    }
}
