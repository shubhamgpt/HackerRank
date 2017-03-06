import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum_front=0, sum_back=0;
        
        for(int row=0; row < n; row++){
            for(int col=0; col < n; col++){
                a[row][col] = in.nextInt();
            }
        }
        
        int diff=0, j=n-1, sum_r=0, sum_l=0;
        
        for(int i=0; i<n; i++){
            sum_r += a[i][i];
            sum_l += a[i][j];
            j--;
        }
        
        System.out.println(Math.abs(sum_r-sum_l));
    }
}
