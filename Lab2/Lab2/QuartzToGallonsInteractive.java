import javax.swing.*;

public class QuartzToGallonsInteractive {
    public static void main(String[] args) {
        final short NUMBER_OF_QUARTZ_IN_A_GALLON = 4;
        short quartzRequired;
        quartzRequired = Short.parseShort(JOptionPane.showInputDialog("How many quartz do you need?"));
        JOptionPane.showMessageDialog(null, "A job that needs " + quartzRequired +
                " quartz requires " + quartzRequired / NUMBER_OF_QUARTZ_IN_A_GALLON + " gallons plus " +
                quartzRequired % NUMBER_OF_QUARTZ_IN_A_GALLON + " quartz.");
    }
}
