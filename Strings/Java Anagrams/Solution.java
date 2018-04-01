static boolean isAnagram(String a, String b) {
    // Complete the function
    long sumA, sumB;
    sumA = sumB = 1;
    
    if (a.length() != b.length())
        return false;
    
    String A = a.toLowerCase();
    String B = b.toLowerCase();
 
    for (int i=0; i< A.length(); i++){
       sumA += sumA*A.charAt(i);
       sumB += sumB*B.charAt(i);
    }
    
    if (sumA == sumB)
        return true;
    else
        return false;
}