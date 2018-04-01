import static java.lang.System.in;

class Prime{
    
    public void checkPrime(int... numbers){
        for(int n : numbers){
            if(isPrime(n)){
               System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }   
}