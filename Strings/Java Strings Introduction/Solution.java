import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        
        String before = (A.compareTo(B) > 0) ? "Yes" : "No";

        String capital = A.substring(0,1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1, B.length());
        
        System.out.println(length);
        System.out.println(before);
        System.out.println(capital);
        
    }
}
