class boy {
    String name;
    static String school;
}

public class Static { // static variables , methods we can call directly by class
    public static void main(String[] args) {
        boy.school = "Srvm";
        boy student1 = new boy();
        student1.name = "rahul";
        System.out.println(student1.school);     
        System.out.println(student1.name);
    }
}
