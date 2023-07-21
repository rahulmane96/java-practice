import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class conditional {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);


        int cash = sc.nextInt();

        if (cash < 10) 
        {

            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }

        else if ( cash > 10 && cash < 50) {

            System.out.println("can get 1 thing");
        }

        else 
        System.out.println( " can get both");
    }
    
}
