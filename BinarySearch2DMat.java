import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr)
    {
        //    Write your code here.
        int row = arr.size(), col = arr.get(0).size();

        int s = 0, e = row * col - 1;

        while(s <= e){
            int mid = s + (e-s) / 2;
            int r = mid / col;
            int c = mid % col;

            int ele = arr.get(r).get(c);
            if(ele == x)
                return true;
            else if(ele < x)
                s = mid + 1;
            else 
                e = mid - 1;

        }

        return false;
    }
}
