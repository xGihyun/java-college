
import java.util.*;

public class Foo2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter score: ");
    int score = scan.nextInt();

    System.out.println("Your grade is: " + (score > 60 ? "Pass." : "Fail."));
  }
}
