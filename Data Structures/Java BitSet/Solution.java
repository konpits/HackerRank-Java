import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        String op; 
        int s1, s2;
        
        int m = in.nextInt();
        for (int i=0; i < m; i++){
           op = in.next();
           s1 = in.nextInt();
           s2 = in.nextInt();
            
           if (op.compareTo("AND") == 0){
               if (s1 == 1){
                   b1.and(b2);
                   System.out.println(b1.cardinality() + " " + b2.cardinality());
               }
               else{
                   b2.and(b1);   
                   System.out.println(b1.cardinality() + " " + b2.cardinality());
               }           
           }
           else if (op.compareTo("OR") == 0){
               if (s1 == 1){
                   b1.or(b2);
                   System.out.println(b1.cardinality() + " " + b2.cardinality());                   
               }
               else{
                   b2.or(b1);  
                   System.out.println(b1.cardinality() + " " + b2.cardinality());   
               }
           }
           else if (op.compareTo("XOR") == 0){
               if (s1 == 1){
                   b1.xor(b2);
                   System.out.println(b1.cardinality() + " " + b2.cardinality());                   
               }
               else{
                   b2.xor(b1); 
                   System.out.println(b1.cardinality() + " " + b2.cardinality());
               }
           }
           else if (op.compareTo("FLIP") == 0){
               if (s1 == 1){
                   b1.flip(s2);
                   System.out.println(b1.cardinality() + " " + b2.cardinality());                   
               }
               else{
                   b2.flip(s2);
                   System.out.println(b1.cardinality() + " " + b2.cardinality());  
               }
           }
           else if (op.compareTo("SET") == 0){
               if (s1 == 1){
                   b1.set(s2);
                   System.out.println(b1.cardinality() + " " + b2.cardinality());                   
               }
               else{
                   b2.set(s2); 
                   System.out.println(b1.cardinality() + " " + b2.cardinality()); 
               }
           }
           else ;
        }
    }
}