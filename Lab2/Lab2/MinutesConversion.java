import javax.swing.*;

public class MinutesConversion {
    public static void main(String[] args) {
        final int MINUTES_IN_AN_HOUR = 60;
        final int HOURS_IN_A_DAY = 24;
        float numberOfMinutes;
        float numberOfHours;
        float numberOfDays;

        numberOfMinutes = Float.parseFloat(JOptionPane.showInputDialog("Enter number of minutes for conversion:"));

        numberOfHours = numberOfMinutes / MINUTES_IN_AN_HOUR;
        numberOfDays = numberOfHours / HOURS_IN_A_DAY;

        JOptionPane.showMessageDialog(null, String.format("%.0f is equal to %.2f hours or %.3f days",
                numberOfMinutes, numberOfHours, numberOfDays));
    }
}
