import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.nextLine());
        BigInteger b = new BigInteger(in.nextLine());
        in.close();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}