import javax.swing.*;

public class NuezBanhaoLabAct6 {
  public static void main(String[] args) {
    double totalAmount = 0.0;

    String inputPizza = JOptionPane.showInputDialog(null,
        "+++++++++++++++++\nPIZZA COMPANY\n+++++++++++++++++\nA. Pizza Deluxe - P300\nB. Meatlover's Pizza - P250\nC. Garden Fresh Pizza - P175\nInput your pizza type:");

    char pizzaType = inputPizza.toUpperCase().charAt(0);

    switch (pizzaType) {
      case 'A':
        totalAmount += 300.0;
        break;
      case 'B':
        totalAmount += 250.0;
        break;
      case 'C':
        totalAmount += 175.0;
        break;
      default:
        JOptionPane.showMessageDialog(null, "Invalid pizza type.", "ERROR", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        break;

    }

    String inputPizzaSize = JOptionPane.showInputDialog(null,
        "+++++++++++++++++\nSELECT PIZZA SIZE\n+++++++++++++++++\n1. Personal - P50\n2. Double - P175\n3. Family Size - P250\nInput your pizza size:");

    int pizzaSize = Integer.parseInt(inputPizzaSize);

    switch (pizzaSize) {
      case 1:
        totalAmount += 50.0;
        break;
      case 2:
        totalAmount += 175.0;
        break;
      case 3:
        totalAmount += 250.0;
        break;
      default:
        JOptionPane.showMessageDialog(null, "Invalid pizza size.", "ERROR", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        break;
    }

    String inputSenior = JOptionPane.showInputDialog(null, "Senior Citizen <Y/N:>");
    char citizenStatus = inputSenior.toUpperCase().charAt(0);

    switch (citizenStatus) {
      case 'Y':
        totalAmount *= 0.8;
        break;
      case 'N':
        break;
      default:
        JOptionPane.showMessageDialog(null, "Invalid choice.", "ERROR", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        break;
    }

    String output = String.format("Total bill is: %,.2f", totalAmount);

    JOptionPane.showMessageDialog(null, output);
  }
}
