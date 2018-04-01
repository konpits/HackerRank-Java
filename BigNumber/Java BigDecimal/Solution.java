//Write your code here
BigDecimal []b =new BigDecimal[n+2];
for(int i = 0; i < n; i++) {
    b[i] = new BigDecimal(s[i]);
}       
for (int i = 0; i < n - 1; i++) {
    for (int j = i + 1; j < n; j++) {
        if (b[i].compareTo(b[j]) == -1) {
            
            String temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            
            BigDecimal tempB = b[j];
            b[j] = b[i];
            b[i] = tempB;
        }
    }
}

