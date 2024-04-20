import java.util.*;
public class practise {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate90(matrix);
    }
    static void rotate90(int matrix[][])
    {
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=i ; j<matrix[0].length ; j++)
            {
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int column=0 ; column<matrix.length/2 ; column++)
        {
            for(int row=0 ; row<matrix.length ; row++)
            {

                int temp = matrix[row][column];
                matrix[row][column] = matrix[row][matrix[0].length-column-1];
                matrix[row][matrix[0].length-column-1]= temp;
            }
        }

    }
}
