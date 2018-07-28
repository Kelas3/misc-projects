import java.util.Scanner;
import java.util.Random;
public class guessingGame
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int guess = 0;
        int upperLimit = 100;
        int lowerLimit = 1;
        String myAnswer = "";
        int numberOfTries = 0;
        while(!myAnswer.equals("yes")) 
        {
            guess = (upperLimit + lowerLimit ) / 2;
            System.out.println("I think it's " + guess);
            myAnswer = in.nextLine();   
            numberOfTries++;
            if(myAnswer.equals("higher"))
            { 
                lowerLimit = guess + 1;
            } 
            else if(myAnswer.equals("lower"))
            { 
                upperLimit = guess - 1;
            }           
        }
        System.out.println("Got'em");
        System.out.println("I got your number in " + numberOfTries + " guesses");
    }
}