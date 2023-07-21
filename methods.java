public class methods {

    public static void Printjava() {

        System.out.println("hello java");
    }

    public static void printname(String name) {

        System.out.println(name);

    }

    public static void printsum(int a, int b) {

        int sum = a + b;

        System.out.println(sum);

    }

    public static void main(String[] args) {

        methods.Printjava();
        Printjava();
        Printjava();

        methods.printname("praveen");
        printname("rahul");
        printname("sanchit");

        printsum(1, 10);

        methods.Printjava();

    }

}
