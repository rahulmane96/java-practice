import java.util.Arrays;
import java.util.Collections;

import javax.swing.SortOrder;

public class Array {

    public static void main(String[] args) {

        int age = 30;
        int physics = 90;
        int chem = 80;
        int eng = 50;
        int marathi = 65;

        int[] marks = new int[3]; // type [] arryName = new type [size] -syntax for array
                                  // Another way- type arryName[] = { , , ,};

        marks[0] = 9;
        marks[1] = 80;
        marks[2] = 50;

        // System.out.println(marks[2]);

        // System.out.println(marks.length);

        // System.out.println(marks[0]);
        // Arrays.sort(marks);
        // Arrays.sort(marks, Collections.reverseOrder());
        // for(int i=0;i<marks.length;i++)
        // System.out.println(marks[i]);

        int[] submarks = { 20, 50, 80 };
        int[][] finalmarks = { { 80, 90, 95 }, { 50, 60, 70 } };
        System.out.println(finalmarks[1][2]);
        int[] numbers = { 1, 2, 3, 4, 5 };
        int length = numbers.length;
        for (int i = 0; i < length; i++)
        System.out.println(numbers.length);
    }

}
