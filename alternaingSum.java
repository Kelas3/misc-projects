//Computes alternating sum of array
//@author Salek Khan
import java.util.Scanner;
public class alternaingSum 
{
    public static void main(String[] args)
    {

        int[] num = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i+ 1; j < num.length - 1 ; j++)
            {
                System.out.print(i);
                System.out.print(j);
            }
        }
    }
}
