/*
* Tests different matrix operations
* @author Salek Khan
/*

public class MatrixMath
{   
    /**
    * Multiply a matrix by a scalar number
    * @param a The matrix that will be multiplied.
    * @param k The scalar number that the matrix will be multiplied by
    * @return The product of the matrix and the scalar number.
    */
    public static Matrix scalarMultiplication(Matrix a, int k)
    {
        int[][] tempRow = new int[a.length()][a.length(0)];
        for (int i = 0; i < a.length(); i++)
        {
            for (int j = 0; j < a.length(i); j++)
            {
                tempRow[i][j] = a.getElement(i, j) * k;
            }
        }
        return new Matrix(tempRow);
    }
    
    /**
    * Adds two matricies together.
     * @param a The first matrix to add.
     * @param b the second matrix to add.
     * @return sum of both matrices.
     */
    public static Matrix addition(Matrix a, Matrix b)
    {
        if(a.length() != b.length() || a.length(0) != b.length(0))
        {
            System.out.print("Cannot perform operation, ignore output!");
        }
        int[][] temp1 = new int[a.length()][a.length(0)];
        int[][] temp2 = new int[b.length()][b.length(0)];
        for(int i = 0; i < a.length(); i++)
        {
            temp1[i] = a.getRow(i);
            temp2[i] = b.getRow(i);
            for(int j = 0; j < a.length(i); j++)
            {
                temp1[i][j] += temp2[i][j];
            }
        }
        return new Matrix(temp1);
    }

    /**
     * Subtract two matricies together.
     * @param a The matrix that will have a matrix subtracted from it.
     * @param b The matrix that will be subtracted from a.
     * @return Difference of both matrices.
     */
    public static Matrix subtraction(Matrix a, Matrix b)
    {
        if(a.length() != b.length() || a.length(0) != b.length(0))
        {
            System.out.print("Dimensions differ, ");
        }
        int[][] temp = new int[b.length()][b.length(0)];
        for(int i = 0; i < a.length(); i++)
        {
            for(int j = 0; j < b.length(0); j++)
            {
                temp[i][j] = (a.getElement(i, j) - b.getElement(i, j));
            }
        }
         return new Matrix(temp);
    }
        
   

    /**
     * Multiply two matrices.
     * @param a The matrix that will be multiplied
     * @param b The matrix that matrix a would be multiplied by.
     * @return Product of a and b.
     */
    public static Matrix multiply(Matrix a, Matrix b)
    {
        int[][] temp = new int[a.length()][b.length(0)];
        if(a.length() != b.length(0))
        {
            System.out.print("UNDEFINED!");
            return null;
        }
        else
        {
            for(int i = 0; i < a.length(); i++)
            {
                for(int j = 0; j < b.length(0); j++)
                {
                    for(int k = 0; k < a.length(0); k++)
                    {
                        temp[i][j] +=  a.getElement(i, k) * b.getElement(k, j);
                    }
                }
            }
        }
        return new Matrix(temp);
    }
}
