import javax.swing.*;

public class TicketNumber {
    public static void main(String[] args) {
        int ticketNumberInput;
        int lastNumber;
        int ticketWithoutLastNumber;

        ticketNumberInput = Integer.parseInt(JOptionPane.showInputDialog("Enter ticket number:"));
        lastNumber = ticketNumberInput % 10;
        ticketWithoutLastNumber = ticketNumberInput / 10;
        if ((ticketWithoutLastNumber % 7) == lastNumber){
            JOptionPane.showMessageDialog(null, "true");
        }
        else {
            JOptionPane.showMessageDialog(null, "false");
        }
    }
}
