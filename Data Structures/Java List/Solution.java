import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for(int i = 0; i < size; i++){
            list.add(in.nextInt());
        }
        int operations = in.nextInt();
        for(int i = 0; i < operations; i++){
            String oper1 = in.next();
            if(oper1.compareTo("Insert") == 0){
                int position = in.nextInt();
                int number = in.nextInt();
                list.add(position, number);
            }
            else if(oper1.compareTo("Delete") == 0){
            int position = in.nextInt();
            list.remove(position);
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");        
        }
    }
}
