import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {

    public static void main(String[] args) {

        int startingNumber = 1;
        int endingNumber = 30;

        int Attempts = 5;
        int score = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(endingNumber - startingNumber + 1) + startingNumber;

        JOptionPane.showMessageDialog(null, "Hey!! C'mon, let's play the Number Guessing Game");

        for (int i = startingNumber; i <= Attempts; i++) {

            String number = JOptionPane.showInputDialog("Guess a number between " + startingNumber + " and " + endingNumber + ":");
            int guessNumber = Integer.parseInt(number);

            if (guessNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "Woo-Hoo!! Congrats, You got the right number : " + guessNumber + " in " + i + " attempts.");
                score = Attempts - i + 1;
                break;
            }
            else if (guessNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "Oops! the number you guessed is lower than the actual number. Try again. " + ( Attempts - i ) + " Attempts Remaining.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Oops! the number you gussed is higher than the actual number. Try again."  + ( Attempts - i ) + " Attempts Remaining.");
            }

        }

        if(score > 0){
            JOptionPane.showMessageDialog(null, "Final score : " + score );
        }
        else {
            JOptionPane.showMessageDialog(null, "Final Score : " + score );
        }

    }


}