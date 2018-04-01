import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int result = a + b;
            System.out.print(result + " ");
            for (int j = 2, x = 1; x < n ; j*=2 , x++){
                result = result + j*b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
