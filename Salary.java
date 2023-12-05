import java.util.*;

public class Salary {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter salary: ");
    double salary = scan.nextDouble();

    if (salary < 0) {
      System.out.println("Invalid amount.");
      System.exit(0);
    }

    System.out.print("Enter years of service: ");
    double yearsOfService = scan.nextDouble();

    if (yearsOfService < 0) {
      System.out.println("Invalid amount.");
      System.exit(0);
    }

    double bonus = 0.0;

    if (yearsOfService > 19) {
      bonus = salary * 0.25;
    } else if (yearsOfService > 14 && yearsOfService < 20) {
      bonus = salary * 0.2;
    } else if (yearsOfService > 8 && yearsOfService < 15) {
      bonus = salary * 0.15;
    } else if (yearsOfService > 4 && yearsOfService < 9) {
      bonus = salary * 0.1;
    } else {
      bonus = salary * 0.05;
    }

    double totalSalary = bonus + salary;

    System.out.printf("Salary: %,.2f\n", salary);
    System.out.printf("Bonus: %,.2f\n", bonus);
    System.out.printf("\nTotal Salary: %,.2f\n", totalSalary);
  }
}
