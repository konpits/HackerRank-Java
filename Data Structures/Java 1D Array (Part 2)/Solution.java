import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int goal = game.length;


        int[] temp = new int[goal];
        Arrays.fill(temp, 1);
        temp[0] = game[0];


        for(int i = 0; i<goal; i++) {

            if(temp[i] == 1) continue;

            if(i+leap >= goal || i+1 == goal) return true;

            if(game[i+leap] == 0) {
                temp[i+leap] = 0;
                if(i>0 || leap>0) {
                    
                    if(game[i+leap-1] == 0){
                        temp[i+leap-1] = 0;
                        for(int j = i+leap-2; j>0; j--){
                            if (game[j] == 0){
                                temp[j] = game[j];
                            }
                            else
                               break;
                        }
                        
                    }
                        
                }
            }
            if(game[i+1] == 0) temp[i+1] = 0;
        }
        return false;   
     
    }
    
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
