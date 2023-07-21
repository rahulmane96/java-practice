abstract class Animal {
    abstract void walk();

    public void ghoda() {
        System.out.println("Horse is playing");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chekein extends Animal {

    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

class Second {

    int x = 5;

    public void sample() {

    }

    public static void main(String[] args) {

        Second objj = new Second();
        objj.sample();
        System.out.println(objj.x);

    }

}

public class Prani {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chekein chekein = new Chekein();
        chekein.walk();
        chekein.ghoda();

    }

}
