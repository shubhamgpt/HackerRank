import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long input[] = {a, b, c, d, e};
        Arrays.sort(input);
        long sum_max=0, sum_min=0;
        
        for(int i=0; i<(input.length-1); i++){
            sum_min +=input[i];
        //    System.out.print(input[i]+" ");   
        }
        for(int i=1; i<input.length; i++){
            sum_max +=input[i];
        }
        System.out.print(sum_min + " " + sum_max);   
    }
}
