import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int neg=0, pos=0, zero=0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if ( arr[arr_i] < 0){
                neg++;
            }else if ( arr[arr_i] == 0){
                zero++;
            }else{
                pos++;
            }
        }
        System.out.printf("%.6f", (float) pos / n);
        System.out.println("");
        System.out.printf("%.6f", (float) neg / n);
        System.out.println("");
        System.out.printf("%.6f", (float) zero / n);
    }
}
