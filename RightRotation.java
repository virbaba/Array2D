import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
		// Write your code here.
		int pre = 0, curr = 0;
		
		// if k == 0 or number of column is equall to number of 
		// rotation then no need of rotation
		if( k == 0 || m % k == 0)
			return mat;
		// if k > m suppose m = 9 & k = 100 mean column is 9 and k is
		// 100 then only we need 100 % 9 = 1; rotation which help to
		// optimized it
		if(k > m){
			k = k % m;
		}
		while(k != 0){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					if(j == m - 1){
						mat[i][0] = mat[i][j];
						mat[i][j] = pre;
					}
					else{
						curr = mat[i][j];
						mat[i][j] = pre;
						pre = curr;
					}
				}
			}
			k--;
		}
		return mat;
	}
}
