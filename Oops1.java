import java.util.*;

import Bank.*;

class Shape1 {

    public void area() {

        System.out.println("display area");
    }
}

class Triangle1 extends Shape1 {

    public void area(int l, int h) {

        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Triangle1 {

    public void area(int r) {

        System.out.println((3.14) * r * r);
    }

}

public class Oops1 {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.name = "cutomer1";
        Bank banknew = new Bank();
        banknew.name = "SBI";
        System.out.println(account1.name);
        System.out.println(banknew.name);

    }

}
