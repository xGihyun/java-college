import java.util.*;

public class Foo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter score: ");
    int score = scan.nextInt();

    if (score < 1) {
      System.out.println("Invalid score");
    } else {
      if (score < 60) {
        System.out.println("Your grade is F");
      } else {
        if (score < 70) {
          System.out.println("Your grade is D");
        } else {
          if (score < 80) {
            System.out.println("Your grade is C");
          } else {
            if (score < 90) {
              System.out.println("Your grade is B");
            } else {
              if (score > 100) {
                System.out.println("Invalid score");
              } else {
                System.out.println("Your grade is A");
              }
            }
          }
        }
      }
    }
  }
}
