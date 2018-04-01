import java.util.*;
public class Solution {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        Calendar cal = Calendar.getInstance();
        
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        
        String s = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());  
        return s.toUpperCase();
    }
}