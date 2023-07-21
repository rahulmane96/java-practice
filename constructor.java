class Student {

    String name;
    int age;

    public void studentsinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(String name, int age) { // paramrtirised constructor

        this.name = name;
        this.age = age;

    }

    Student(Student object2) {
        this.name = object2.name;
        this.age = object2.age;

    }

    Student() {

    } // Default constructor (non-parameterized)
}

public class constructor {

    public static void main(String[] args) {

        Student object = new Student(); // () non parmarmetirized constructor
        object.name = "Rahul";
        object.age = 27;

        Student object2 = new Student(object);

        object2.studentsinfo();
        object.studentsinfo();

    }

}
