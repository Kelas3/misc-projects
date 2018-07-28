import java.util.Scanner;
public class TrueFalse
{
    public void TrueFalse(int NumberOfQ)
    {
        Scanner guess = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("How many questions?");
        NumberOfQ = guess.nextInt();
        
        int count = 0;
        for ( count = 0; count < NumberOfQ; count++)
            if (Math.random() <= 0.5)
            {
                System.out.println("True");
                System.out.println("");
            }
            else
            {
                System.out.println("False");
                System.out.println("");
            }
    }
}
