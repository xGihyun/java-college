import java.util.Scanner;

public class Nuez {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("> SINGLE Person:\n");
    System.out.println("| Over    | but less than | The amount income tax to withold is:        |");
    System.out.println("| ------- | ------------- | ------------------------------------------- |");
    System.out.println("| $0      | $6,300        | $0                                          |");
    System.out.println("| $6,300  | $7,300        | $0 +(0.50% of the excess over $6,300)       |");
    System.out.println("| $7,300  | $8,800        | $5.00 +(1.00% of the excess over $7,300)    |");
    System.out.println("| $8,800  | $10,050       | $20.00 +(2.00% of the excess over $8,800)   |");
    System.out.println("| $10,050 | $11,200       | $45.00 +(3.00% of the excess over $10,050)  |");
    System.out.println("| $11,200 | $13,500       | $79.50 +(4.00% of the excess over $11,200)  |");
    System.out.println("| $13,500 | $15,000       | $171.50 +(5.00% of the excess over $13,500) |");
    System.out.println("| $15,000 | and above     | $246.50 +(5.25% of the excess over $15,000) |\n\n");

    System.out.println("> MARRIED Person:\n");
    System.out.println("| Over    | but less than | The amount income tax to withold is:        |");
    System.out.println("| ------- | ------------- | ------------------------------------------- |");
    System.out.println("| $0      | $12,600       | $0                                          |");
    System.out.println("| $12,600 | $14,600       | $0 +(0.50% of the excess over $12,600)      |");
    System.out.println("| $14,600 | $17,600       | $10.00 +(1.00% of the excess over $14,300)  |");
    System.out.println("| $17,600 | $20,100       | $40.00 +(2.00% of the excess over $17,600)  |");
    System.out.println("| $20,100 | $22,400       | $90.00 +(3.00% of the excess over $20,100)  |");
    System.out.println("| $22,400 | $24,800       | $159.00 +(4.00% of the excess over $22,400) |");
    System.out.println("| $24,800 | $27,600       | $255.00 +(5.00% of the excess over $24,800) |");
    System.out.println("| $27,600 | and above     | $395.00 +(5.25% of the excess over $27,600) |\n\n");

    System.out.println("-------------------------------------------------------------------------\n\n");

    System.out.println("A - Single");
    System.out.println("B - Married\n");

    System.out.print("Enter status: ");
    char status = scan.nextLine().toUpperCase().charAt(0);

    if (!(status == 'A' || status == 'B')) {
      System.out.println("Invalid input.");
      System.exit(0);
    }

    System.out.print("\nEnter wage: ");
    double wage = scan.nextDouble();

    if (wage < 0.0) {
      System.out.println("Invalid amount.");
      System.exit(0);
    }

    double taxToWithold = 0.0;
    double taxExcessPercent = 0.0;
    double excess = 0.0;
    double totalTax = 0.0;

    switch (status) {
      case 'A':
        if (wage >= 0.0 && wage < 6300.0) {
          taxExcessPercent = 0.0;
          excess = 0.0;
        } else if (wage >= 6300.0 && wage < 7300.0) {
          taxExcessPercent = 0.005;
          excess = wage - 6300.0;
        } else if (wage >= 7300.0 && wage < 8800.0) {
          taxToWithold = 5.0;
          taxExcessPercent = 0.01;
          excess = wage - 7300.0;
        } else if (wage >= 8800.0 && wage < 10050.0) {
          taxToWithold = 20.0;
          taxExcessPercent = 0.02;
          excess = wage - 8800.0;
        } else if (wage >= 10050.0 && wage < 11200.0) {
          taxToWithold = 45.0;
          taxExcessPercent = 0.03;
          excess = wage - 10050.0;
        } else if (wage >= 11200.0 && wage < 13500.0) {
          taxToWithold = 79.50;
          taxExcessPercent = 0.04;
          excess = wage - 11200.0;
        } else if (wage >= 13500.0 && wage < 15000.0) {
          taxToWithold = 171.50;
          taxExcessPercent = 0.05;
          excess = wage - 13500.0;
        } else {
          taxToWithold = 246.50;
          taxExcessPercent = 0.0525;
          excess = wage - 15000.0;
        }
        break;
      case 'B':
        if (wage >= 0.0 && wage < 12600.0) {
          taxExcessPercent = 0.0;
          excess = 0.0;
        } else if (wage >= 12600.0 && wage < 14600.0) {
          taxExcessPercent = 0.005;
          excess = wage - 12600.0;
        } else if (wage >= 14600.0 && wage < 17600.0) {
          taxToWithold = 10.0;
          taxExcessPercent = 0.01;
          excess = wage - 14600.0;
        } else if (wage >= 17600.0 && wage < 20100.0) {
          taxToWithold = 40.0;
          taxExcessPercent = 0.02;
          excess = wage - 17600.0;
        } else if (wage >= 20100.0 && wage < 22400.0) {
          taxToWithold = 90.0;
          taxExcessPercent = 0.03;
          excess = wage - 20100.0;
        } else if (wage >= 22400.0 && wage < 24800.0) {
          taxToWithold = 159.00;
          taxExcessPercent = 0.04;
          excess = wage - 22400.0;
        } else if (wage >= 24800.0 && wage < 27600.0) {
          taxToWithold = 255.00;
          taxExcessPercent = 0.05;
          excess = wage - 24800.0;
        } else {
          taxToWithold = 395.00;
          taxExcessPercent = 0.0525;
          excess = wage - 27600.0;
        }
        break;
      default:
        System.out.println("Invalid input.");
    }

    totalTax = taxToWithold + (excess * taxExcessPercent);
    double totalAmount = wage + totalTax;

    System.out.printf("\nWage: %,.2f\n", wage);
    System.out.printf("Tax: %,.2f\n", totalTax);
    System.out.printf("Total Amount: %,.2f\n", totalAmount);
  }
}
