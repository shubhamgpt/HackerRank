import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    
        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
                if(j<n-i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println("");
        }
        
    }
    
}
