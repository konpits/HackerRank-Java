import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) throws Throwable {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
        Scanner sc = new Scanner(System.in);
		String S = sc.next();

		for (byte oneByte : MessageDigest.getInstance("SHA-256").digest(S.getBytes())) {
			System.out.printf("%02x", oneByte);
		}
		System.out.println();

		sc.close();
	}
}