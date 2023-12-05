import javax.swing.JOptionPane;

public class EggJOption {
  public static void main(String[] args) {
    final double DOZEN_PRICE = 36.0;
    final double INDIVIDUAL_PRICE = 4.75;

    JOptionPane.showMessageDialog(null,
        "<html><div style='text-align:center;'><b>Hello and welcome to Dizon Dairy Farm!</b><br><br>Press <span style='color:green; font-weight:bold'>OK</span> to continue</div></html>",
        "welcome_message", JOptionPane.PLAIN_MESSAGE);

    String input = JOptionPane.showInputDialog(null,
        "<html>Our eggs cost <strong>PHP 36.00</strong> per dozen and <strong>PHP 4.75</strong> each!<br><br><b>Enter the number of eggs you want to buy:</b></html>");

    int numberOfEggs = Integer.parseInt(input);

    int dozenOfEggs = numberOfEggs / 12;
    int remainingEggs = numberOfEggs % 12;

    double dozenCost = dozenOfEggs * DOZEN_PRICE;
    double remainingCost = remainingEggs * INDIVIDUAL_PRICE;
    double totalCost = dozenCost + remainingCost;

    String totalCostMessage = String.format(
        "<html><b>You purchased %,d eggs.</b><br><br>" +
            "Breakdown:<br>" +
            "- %,d dozen/s at PHP %.2f/dozen: PHP %,.2f<br>" +
            "- %,d individual egg/s at PHP %.2f/egg: PHP %,.2f<br><br>" +
            "<b>Total Cost: PHP %,.2f</b></html>",
        numberOfEggs,
        dozenOfEggs, DOZEN_PRICE, dozenCost,
        remainingEggs, INDIVIDUAL_PRICE, remainingCost,
        totalCost);

    JOptionPane.showMessageDialog(null, totalCostMessage);

    JOptionPane.showMessageDialog(null, "<html><b>Thank you for purchasing at Dizon Dairy Farm!</b></html>");
  }
}
