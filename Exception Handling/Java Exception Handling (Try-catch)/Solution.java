import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        try{
           int a = in.nextInt();
           int b = in.nextInt();
           
           System.out.println(a/b);  
        }catch(Exception exc){
          if (exc instanceof InputMismatchException)
              System.out.println("java.util.InputMismatchException");
          else if (exc instanceof ArithmeticException)
              System.out.println("java.lang.ArithmeticException: / by zero");
          else 
              ;
        }
    }
}