import java.util.*;
import java.io.*;

public class Solution {

	public static void inplaceRotate(int[][] mat, int n) {
		// Write your code here.

		int m = mat[0].length;

		int row = 0, col = m - 1;

		while (row < n) {
			for (int i = row, j = col; i < n && j >= 0; i++, j--) {
				int t = mat[row][j];
				mat[row][j] = mat[i][col];
				mat[i][col] = t;
			}
			row++;
			col--;
		}

		for (int[] arr : mat) {
			int i = 0, j = arr.length - 1;
			while (i < j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
			}
		}
		

	}

}
