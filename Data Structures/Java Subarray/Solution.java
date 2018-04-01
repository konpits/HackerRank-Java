import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum = 0, count = 0;
        Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
            if (arr[i] < 0) count++;
        }
        in.close();
        
        for (int i = 0; i < size-1; i++){
               sum = arr[i];
               for (int j = i+1; j < size; j++){
                     sum += arr[j];
                     if (sum < 0){
                     count++;
                     }
               }
        }
        System.out.println(count);
    }
}