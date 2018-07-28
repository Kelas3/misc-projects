/**
 * hi
 */
import java.util.Scanner;

class Calculation 
{
    public static void main () 
    {
        int N, i, sum = 0;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number");
        N = in.nextInt(); 
 
        for(i = 0; i <= N; i++)
        {
            sum += i;
            if((i%2) == 1)
            {
              sum += i;
                
            } 
        }
        System.out.print("Sum of all odd numbers between 0 to "+ N + " = " + sum);
    }
}
        
