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

    HashMap<String, Double> prices = new HashMap<>();

    prices.put("a", 45000.0);
    prices.put("b", 30000.0);
    prices.put("o", 17000.0);

    String busClass;

    do {
      System.out.println("\nEnter your bus class:\n");
      System.out.println("A - Class A");
      System.out.println("B - Class B");
      System.out.println("O - Ordinary\n");

      busClass = scan.nextLine().toLowerCase();

      if (!prices.containsKey(busClass)) {
        System.out.println("Invalid class, try again.\n");
      }

    } while(!prices.containsKey(busClass));


    double payment; 
    double discountMultiplier = 1.0;

    if (age >= 60) {
      System.out.println("\nThe user is a senior, 20% discount will be applied.\n");
      discountMultiplier -= 0.2;
    }

    double priceToPay = prices.get(busClass) * discountMultiplier;

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
