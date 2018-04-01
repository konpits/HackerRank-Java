import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");

        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            int count = 0;
            while (matcher.find()) {
                if (matcher.group(2).length() != 0) {
                    System.out.println(matcher.group(2));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
