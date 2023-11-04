import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr) {
        // Write your code here.
        int row = arr.size(), col = arr.get(0).size();
        int r = 0, c = col - 1;

        while(r < row && c >= 0){

           int ele = arr.get(r).get(c);

           if(ele ==  x)
                return true;

            else if(x < ele)
                c--;
            else
                r++; 
                
        }

        return false;
    }
}
