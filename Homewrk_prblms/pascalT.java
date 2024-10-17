package Homewrk_prblms;

public class pascalT {
    public static void main(String[] args) {
        int numRows = 5; // Change this to generate more rows
        printPascalsTriangle(numRows);
    }

    public static void printPascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1]; // Allocate space for each row
            triangle[i][0] = 1; // The first element is always 1
            triangle[i][i] = 1; // The last element is always 1

            // Calculate the values for the current row
            for (int j = 1; j < i; j++)
            {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
