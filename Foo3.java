import java.util.*;

public class Foo3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter score: ");
    int score = scan.nextInt();

    if (score < 1 || score > 100) {
      System.out.println("Invalid score: Score is too hight or too low");
    }
    if (score >= 1 && score <= 59) {
      System.out.println("Your grade is F");
    }
    if (score >= 60 && score <= 69) {
      System.out.println("Your grade is D");
    }
    if (score >= 70 && score <= 79) {
      System.out.println("Your grade is C");
    }
    if (score >= 80 && score <= 89) {
      System.out.println("Your grade is B");
    }
    if (score >= 90 && score <= 100) {
      System.out.println("Your grade is A");
    }
  }
}
