public class MatrixTester extends MatrixMath
{
    public static void main(String[] args)
    {
        int[][] arrOne = {{1, 2},{3, 4}};
        int[][] arrTwo = {{3, 1},{7, 6}};
        int[][] arrThree = {{1, 1, 1},{1, 1}};
        int[][] arrFour = {{1, 1, 2},{4, 4, 2},{5, 4, 1}};
        
        Matrix a = new Matrix(arrOne);
        Matrix b = new Matrix(arrTwo);
        Matrix c = new Matrix(arrThree);
        Matrix d = new Matrix(arrFour);
        System.out.println("A: \n" + a.toString());
        System.out.println("B: \n" + b.toString());
        System.out.println("C: \n" + c.toString());
        System.out.println("D: \n" + d.toString());      
        System.out.println("\nA - B: \n" + MatrixMath.subtraction(a, b));
        System.out.println("A * B: \n" + MatrixMath.multiply(a, b));
        System.out.println("A * 2: \n" + MatrixMath.scalarMultiplication(a, 2));
        System.out.println("A + B: \n" + MatrixMath.addition(a, b));
    }
}
