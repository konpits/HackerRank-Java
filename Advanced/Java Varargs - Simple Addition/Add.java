class Add{
      
    public void add(int... numbers){
      int result = 0, counter = 0;
      String s = "";
      boolean finshed = false;
      for(int n : numbers){
          result += n;
          counter++;
          if (counter == 1){
              s = "" + n;
          }
          else{
             s = s + "+" + n;  
          }
      }
        System.out.println(s+"="+result);
    }     
}
    
