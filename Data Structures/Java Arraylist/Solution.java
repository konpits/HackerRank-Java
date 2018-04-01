import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>(size);
 
        for (int i = 0; i < size; i++){
            arrList.add(new ArrayList<Integer>());
            int sizeCurr = in.nextInt();
            for (int j = 0; j < sizeCurr; j++){
                arrList.get(i).add(in.nextInt());
            }
        }

        size = in.nextInt();
        for (int i = 0; i < size; i++){
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            try{
               System.out.println(arrList.get(x).get(y)); 
            }catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }    
        }
    }
}