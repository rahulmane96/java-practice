import java.util.Scanner;

public class Tiger {

    public static void main(String[] args) {

        Scanner mane = new Scanner(System.in);
        int size = mane.nextInt();

        int[] pgmarks = new int[size];

        // input
        for (int i = 0; i < size; i++) {

            pgmarks[i] = mane.nextInt();

        }

        int x = mane.nextInt();

        // output
        boolean isFound = false;
        for (int i = 0; i < pgmarks.length; i++) {
            if (pgmarks[i] == x) {
                isFound = true;
                System.out.println("x found at index" + i);
            }
        }

        if (isFound == false) {
            System.out.println(x + " not found");
        }
        mane.close();
    }

}
