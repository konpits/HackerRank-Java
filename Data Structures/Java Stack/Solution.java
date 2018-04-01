import java.util.*;
public class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack<String> st = new Stack<String>();
      boolean balanced = false;
      int count = 0;
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
         for(int i = 0; i < input.length(); i++){
             if("{[(".contains(input.substring(i, i+1))){
                 st.push(input.substring(i, i+1));
                 count++;
             }
             else if("}])".contains(input.substring(i, i+1))){
                 if( input.substring(i, i+1).compareTo("}") == 0 && !st.empty()){
                     count--;
                     if (st.pop().compareTo("{") == 0 ){
                        if(st.empty())
                          balanced = true;
                     }
                     else{ 
                         balanced = false;
                         break;
                         }
                 }
                 else if( input.substring(i, i+1).compareTo("]") == 0 && !st.empty()){
                     count--;
                     if (st.pop().compareTo("[") == 0){
                        if(st.empty())
                          balanced = true;
                     }
                     else{
                         balanced = false;
                         break;
                         }
                 }
                 else if( input.substring(i, i+1).compareTo(")") == 0 && !st.empty()){
                     count--;
                     if (st.pop().compareTo("(") == 0){
                        if(st.empty())
                           balanced = true;
                     }
                     else{
                         balanced = false;
                         break;
                         }
                 }
                 else{
                    balanced = false;
                    break;
                 }
             }      
         }
         if(!st.empty()){
             balanced = false;
             for (int i = 0; i < count; i++){
                st.pop();
             }
             count = 0;
         }
         System.out.println(balanced);
         balanced = false;
     }
   }
}
