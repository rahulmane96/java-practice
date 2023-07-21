import java.util.Random;

public class operators {

    public static void main(String[] args) {
        
    // arithmatic operator

    double a = 5;
    double b = 3;
    double moudulo = a % b;
    System.out.println(moudulo);


    // unary operators

    int numb = 7;

    System.out.println(numb++); // in this condition original value will be print
    System.out.println(++numb);
    System.out.println(numb);

    // post increment operator
    // i = 1;
    // print(i++);
    // call stack
    // 1. make a variable i
    // 2. set value to 1
    // 3. return the value 1 to print
    // 4. print the value 1 to screen
    // 5. increment the value to 2 (POST MEANS LATE)

    // pre increment operator
    // print(++i);
    // call stack
    // 6. increment the value to 3 (PRE MEANS EARLY)
    // 7. return the value 3 to print
    // 8. print the value 3 to screen

    // Maths

    // int number = 5 , 6 

    // System.out.println(Math.max(50, 80));
    // System.out.println(Math.min(50, 80));

    // System.out.println((int)(Math.random()*100));


    }
    
}
