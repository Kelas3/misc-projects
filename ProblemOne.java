public class ProblemOne 
{
    public boolean StringCheck (String x)
    {
        if (x.length() > 0 && x.charAt((x.length()-1)) == '*')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}