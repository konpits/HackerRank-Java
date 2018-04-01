import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
       
        
        // Write your code here.
        NumberFormat curr1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat curr2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat curr3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat curr4 = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        
        String us = curr1.format(payment);
        String india = curr2.format(payment);
        String china = curr3.format(payment);
        String france = curr4.format(payment);
       
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
