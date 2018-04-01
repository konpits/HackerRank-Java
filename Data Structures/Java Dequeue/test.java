import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0; 
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < m; i++){
            deque.addFirst(in.nextInt());
        } 
    
        set.addAll(deque);
        count = set.size();
        
        for (int i = 0; i < n - m; i++) {
            
            temp1 = in.nextInt();
            deque.addFirst(temp1);
            
            temp2 = (Integer)deque.removeLast();
            
            if(!deque.contains(temp2)){
                set.remove(temp2);
            }

            set.add(temp1);
            
            count = Math.max(count, set.size());
        }
        System.out.println(count);
    }
}
