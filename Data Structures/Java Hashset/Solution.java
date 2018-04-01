//Write your code here
int count = 0;
HashSet<String> pairs = new HashSet<String>();
for(int i = 0; i < pair_left.length; i++){
    if(pairs.add(pair_left[i] + " " + pair_right[i])){
        count++;
    }
    System.out.println(count); 
}
