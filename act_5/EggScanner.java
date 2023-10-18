import java.util.Scanner;

public class EggScanner {
  public static void main(String[] args) {
    final double DOZEN_PRICE = 36.0;
    final double INDIVIDUAL_PRICE = 4.75;

    Scanner scanner = new Scanner(System.in);

    System.out.println("=========================================================");
    System.out.println("            Welcome to Dizon Dairy Farm!\n");
    System.out.println("              Press ENTER to continue");
    System.out.println("=========================================================");

    scanner.nextLine();

    System.out.println("[!] Our eggs cost PHP 36.00 per dozen and PHP 4.75 each!\n");
    System.out.println("[?] Enter the number of eggs you want to buy:\n");
    System.out.print(">>> ");

    int numberOfEggs = scanner.nextInt();

    System.out.println("\n=========================================================\n");

    int dozenOfEggs = numberOfEggs / 12;
    int remainingEggs = numberOfEggs % 12;

    double dozenCost = dozenOfEggs * DOZEN_PRICE;
    double remainingCost = remainingEggs * INDIVIDUAL_PRICE;
    double totalCost = dozenCost + remainingCost;

    System.out.printf("[!] You purchased %,d eggs.\n", numberOfEggs);
    System.out.println();
    System.out.println("[!] Breakdown:");
    System.out.printf("    - %,d dozen/s of egg/s at PHP %.2f/dozen: PHP %,.2f\n", dozenOfEggs, DOZEN_PRICE, dozenCost);
    System.out.printf("    - %,d individual egg/s at PHP %.2f/egg:    PHP %,.2f", remainingEggs, INDIVIDUAL_PRICE,
        remainingCost);
    System.out.println("\n");
    System.out.printf(">>> Total Cost: PHP %,.2f\n\n", totalCost);

    System.out.println("=========================================================\n");
    System.out.println("     Thank you for purchasing at Dizon Dairy Farm!\n");
    System.out.println("=========================================================");
  }
}
