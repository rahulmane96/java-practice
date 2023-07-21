import java.util.Scanner;

class student {

  String name;
  int marks;
  int[] submarks;
  char ch;

  public void studentinfo() {

    System.out.println(this.name);
    System.out.println(this.marks);
    System.out.println(submarks[1]);
    System.out.println(this.ch);
    Scanner rahul = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int value = rahul.nextInt();
    System.out.println("The value entered is: " + value);

  }
}

public class Main {
  public static void main(String[] args) {

    student info = new student();
    info.name = "Rahul";
    info.marks = 50;
    info.submarks = new int[] { 30, 50, 75 };
    info.ch = 'a';

    info.studentinfo();
  }
}
