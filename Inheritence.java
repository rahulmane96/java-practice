class Shape {
    String colour;

}

class Triangle extends Shape { // Extends here gains the propertis of shape class
                               // still if we not declare inside this class // not only properties also methods
                               // if we gains from another class called inheritence

}

public class Inheritence {

    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.colour = "red";
        System.out.println(T1.colour);
    }

}
