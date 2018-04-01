import java.lang.*;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int a, int b) throws Exception{
        if(a < 0 || b < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if (a == 0 && b == 0){
            throw new Exception("n and p should not be zero.");
        }
        else{
         int result = (int) Math.pow(a, b);
         return result; 
        }
    }
    
}
