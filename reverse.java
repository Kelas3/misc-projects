public class reverse
{
    public static int reverseDigits(Integer j)
    {
        Integer reverseNumber = 0;
        while (j > 0) 
        {
            reverseNumber = reverseNumber * 10 + j % 10;
            j = j / 10;
        }
        return reverseNumber;
    }
}
