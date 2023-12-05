import java.io.*;

public class NuezBanhaoLabAct7 {
  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    boolean hasValidTransactionMethod;

    System.out.println("BROKERAGE COMMISSION CALCULATOR\n");

    System.out.print("(S)SALE OR (P)PURCHASE: ");
    String inputTransaction = reader.readLine();
    char transaction = inputTransaction.toUpperCase().charAt(0);

    switch (transaction) {
      case 'S':
      case 'P':
        hasValidTransactionMethod = true;
        break;
      default:
        hasValidTransactionMethod = false;
    }

    if (!hasValidTransactionMethod) {
      System.out.println("\nInvalid transaction method.");
      System.exit(0);
    }

    System.out.print("Amount of transaction: ");

    String inputAmount = reader.readLine();
    double amount = Double.parseDouble(inputAmount);

    System.out.println("\n\n(E/e) Commodity Exchange");
    System.out.println("(C/c) New York Cotton Exchange");
    System.out.println("(M/m) Mercantile Exchange");

    System.out.print("Where transaction happen: ");

    String inputWhere = reader.readLine();
    char where = inputWhere.toUpperCase().charAt(0);

    double commission = 0.0;

    switch (transaction) {
      case 'S':
        switch (where) {
          case 'E':
            commission = amount * 0.05;
            break;
          case 'C':
            commission = amount * 0.037;
            break;
          case 'M':
            commission = amount * 0.042;
            break;
          default:
            System.out.println("\nTransaction does not exist: Invalid choice.");
            System.exit(0);
        }
        break;
      case 'P':
        switch (where) {
          case 'E':
            commission = amount * 0.063;
            break;
          case 'C':
            commission = amount * 0.043;
            break;
          case 'M':
            commission = amount * 0.057;
            break;
          default:
            System.out.println("\nTransaction does not exist: Invalid choice.");
            System.exit(0);
        }
        break;
      default:
        System.out.println("\nInvalid transaction method.");
        System.exit(0);
    }

    double totalAmount = commission + amount;

    System.out.printf("\nAmount is: %,.2f\n", amount);
    System.out.printf("Commission is: %,.2f\n", commission);
    System.out.printf("Total Amount is: %,.2f", totalAmount);

  }
}
