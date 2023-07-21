import javax.lang.model.util.ElementScanner6;

public class comparisonopeator {

    public static void main(String[] args) {
        // comparison opeators
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

        // conditional statement

        boolean isSunup = true;

        if (!isSunup)

            System.out.println("day");

        else

            System.out.println("night");

        int age = 5;

        if (age > 18)

            System.out.println("can vote");

        else

            System.out.println("cant vote");

        // logical operators
        // && and opreator both conditions need to be satisfy

        int a = 60;

        int b = 40;

        if (a < 50 && b < 50)
            System.out.println("both less than 50");

        // || logical OR if any condtion is true then it will print value for us

        if (a < 50 || b < 50)

            System.out.println("atleast one is less than 50");

        System.out.println("welcome to the world bro");

    }

}
