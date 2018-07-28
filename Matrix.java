
/**
 * Write a description of class Matrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matrix 
{
    int[][] matrix;
    /**
     * Constructs a Matrix from a 2d array.
     * @param arr 2d array that turns into matrix.
     */
    public Matrix(int[][] arr)
    {
        matrix = arr;
    }
    
    /**
     * Returns the elements of a specific row in a matrix.
     * @param row The row to get the elements of.
     * @return An array containing the elements of a row.
     */
    public int[] getRow(int row)
    {
        return matrix[row];
    }
    
    /**
     * Returns the number of rows in a matrix.
     * @return number of rows in the matrix.
     */
    public int length()
    {
        return matrix.length;
    }

    /**
     * Returns the length of a column in a matrix
     * @param row the row for which to check the length
     * @return the length of the row
     */
    public int length(int row)
    {
        return matrix[row].length;
    }
    
    /**
     * returns the element at a specified row and index.
     * @param row the row of the element
     * 
     */
    public int getElement(int row, int index)
    {
        return matrix[row][index];
    }
    
    public String toString()
    {
        String out = "";
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                out += matrix[i][j] + " ";
            }
            out += "\n";
        }
        return out;
    }
}


