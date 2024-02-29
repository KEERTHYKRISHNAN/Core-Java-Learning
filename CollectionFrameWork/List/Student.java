package CollectionFrameWork.List;

import java.util.Comparator;

class asc implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class dec implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class sortbyname implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

//Param const:
public class Student implements Comparable<Student> {
    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    //GetterSetter:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    String name;

    //to String Method:

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    Integer id;

    //To sequence the list or nmae in order use the below function
    //by adding implement comparable interface in student class
    //but it is allowed to sort either any one

    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id , o.id);
//    }

    public int compareTo(Student o) {
        return CharSequence.compare(this.name , o.name);
    }
}
