class Printer
{
   //Write your code here
   public static <T> void printArray(T[] arr){
      for(T t: arr){
         System.out.println(t);
      }
   }
}