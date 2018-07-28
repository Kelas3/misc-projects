import java.util.Random;
import java.util.Scanner;
public class guessCompNumber
{
    public static void main(String [] args)
    {
        Random rand = new Random();
        int numToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println("Guess my number between 1 and 100"); 
        while (win == false)
        {
            guess = input.nextInt();
            numberOfTries++;
            if (guess == numToGuess)
            {
                win = true;
            }
            else if (guess < numToGuess)
            {
                System.out.println("Higher");
            }
            else if (guess > numToGuess)
            {
                System.out.println("Lower");
            }
        }
        System.out.println("You won!");
        System.out.println("The number was " + numToGuess);
        System.out.println("It took you " + numberOfTries + " guesses");
    }

}
