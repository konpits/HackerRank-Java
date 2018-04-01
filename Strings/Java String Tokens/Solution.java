import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] cols = line.split("[^A-Za-z]+");
        System.out.println(cols.length);
        for (String word : cols) {
            System.out.println(word);
        }
    }
}