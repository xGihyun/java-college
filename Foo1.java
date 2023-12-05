import java.util.*;

public class Foo1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter First: ");
    int x = scan.nextInt();
    System.out.print("Enter Second: ");
    int y = scan.nextInt();

    System.out.println("\nA - Addition");
    System.out.println("B - Subtract");
    System.out.println("C - Multiply");
    System.out.print("\nEnter Operation: ");

    char operation = scan.next().charAt(0);

    switch (Character.toUpperCase(operation)) {
      case 'A':
        System.out.println("Input: " + x + " and " + y);
        System.out.printf("Answer: %d", x + y);
        break;
      case 'B':
        System.out.println("Input: " + x + " and " + y);
        System.out.printf("Answer: %d", x - y);
        break;
      case 'C':
        System.out.println("Input: " + x + " and " + y);
        System.out.printf("Answer: %d", x * y);
        break;
      default:
        System.out.println("Invalid operator");
        break;
    }
  }
}
