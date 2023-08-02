import java.util.Scanner;
import java.util.HashMap;

public class Bus {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = scan.nextLine();

    System.out.println("\nEnter your age:");
    int age = scan.nextInt();

    scan.nextLine();


    double payment; 
    double discountMultiplier = 1.0;

    if (age >= 60) {
      System.out.println("\nThe user is a senior, 20% discount will be applied.");
      discountMultiplier -= 0.2;
    }

    HashMap<String, Double> prices = new HashMap<>();

    double CLASS_A = 45000.0 * discountMultiplier;
    double CLASS_B = 30000.0 * discountMultiplier;
    double ORDINARY = 17000.0 * discountMultiplier;

    prices.put("a", CLASS_A);
    prices.put("b", CLASS_B);
    prices.put("o", ORDINARY);

    String busClass;

    do {
      System.out.println("\nEnter your bus class:\n");
      System.out.println("A - Class A  | " + CLASS_A);
      System.out.println("B - Class B  | " + CLASS_B);
      System.out.println("O - Ordinary | " + ORDINARY + "\n");

      busClass = scan.nextLine().toLowerCase();

      if (!prices.containsKey(busClass)) {
        System.out.println("Invalid class, try again.\n");
      }

    } while(!prices.containsKey(busClass));

    double priceToPay = prices.get(busClass);

    do {
      System.out.println("Enter your payment: ");

      payment = scan.nextDouble();

      if (payment < priceToPay) {
        System.out.println("\nPayment is insufficient, required amount is: " + priceToPay + ". Try again.\n");
      }

    } while(payment < priceToPay);

    double change = payment - priceToPay;

    scan.nextLine();

    System.out.println("\nInput destination:");

    String destination = scan.nextLine();

    System.out.println("\nSUMMARY:\n");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Bus Class: " + busClass.toUpperCase());
    System.out.println("Destination: " + destination);
    System.out.println("Amount to pay: " + priceToPay);
    System.out.println("Received payment: " + payment);
    System.out.println("Change: " + change);

  }
}
