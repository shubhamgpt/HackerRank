import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        String hh = time.substring(0, time.length()-8);
        String mmss = time.substring(2, time.length()-2);
        int hh_int = Integer.parseInt(hh); 
        
        if(time.contains("PM")||time.contains("pm")){
            if(hh_int == 12){
                hh = "00";
            }else{
                hh_int += 12;    
            }
            hh = Integer.toString(hh_int);
        }
        
        if(time.contains("AM")||time.contains("am")){
            if(hh_int == 12){
                hh = "00";
            }
        }
        
        System.out.println(hh + mmss);
    }
}
