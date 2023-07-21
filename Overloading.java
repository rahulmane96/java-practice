class StudentNew {
    String name;
    int age;

    public void PrintInfo(String name) { // when we calling same functions/methods for different purpose its
                                         // called as
        // polyporphism in java

        System.out.println(name);
    }

    public void PrintInfo(int age) {

        System.out.println(age);
    }

    public void PrintInfo(String name, int age) {

        System.out.println(name + " " + age);
    }

}

public class Overloading {

    public static void main(String[] args) {

        StudentNew Q1 = new StudentNew();
        Q1.name = "Rahul";
        Q1.age = 25;

        Q1.PrintInfo(Q1.name, Q1.age);
    }

}
