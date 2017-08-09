import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {
        float dollars;
        int centsRemaining;
        int numberOfTwenties;
        int numberOfTens;
        int numberOfFives;
        int numberOfOnes;

        dollars = Float.parseFloat(JOptionPane.showInputDialog("Enter a value in dollars: "));
        centsRemaining = Math.round(dollars * 100);
        numberOfTwenties = centsRemaining / 20;
        centsRemaining %= 20;
        numberOfTens = centsRemaining / 10;
        centsRemaining %= 10;
        numberOfFives = centsRemaining / 5;
        numberOfOnes = centsRemaining % 5;

        JOptionPane.showMessageDialog(null,
                String.format("$%.2f is made up of %d 20c pieces, %d 10c pieces, %d 5c pieces, %d 1c pieces",
                        dollars, numberOfTwenties, numberOfTens, numberOfFives, numberOfOnes));

    }
}
