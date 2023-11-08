import java.util.*;
public class Solution {
    public static void rotateMatrix(int [][]mat){
        // Write your code here.
        int n = mat.length;
        int m = mat[0].length;

        int row = 0, col = 0;

        while(row < n){
            for(int i = row,j = col; i < n && j < m; i++, j++){
                int t = mat[i][row];
                mat[i][row] = mat[col][j];
                mat[col][j] = t;
            }
            row++;col++;
        }

        for(int[] arr : mat){
            int i = 0, j = arr.length - 1;
            while(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;j--;
            }
        }
    }
}
