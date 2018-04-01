import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
   private int id;
   private String name;
   private double cgpa;
   public Student(int id, String name, double cgpa) {
      super();
      this.id = id;
      this.name = name;
      this.cgpa = cgpa;
   }
   public int getID() {
      return id;
   }
   public String getName() {
      return name;
   }
   public double getCGPA() {
      return cgpa;
   } 
}

class Priorities implements Comparator<Student>{
    
    public int compare(Student a, Student b){
        if(a.getCGPA() < b.getCGPA())
            return 1;
        else if(a.getCGPA() > b.getCGPA())
             return -1;
        else if(a.getCGPA() == b.getCGPA()){
             if(a.getName().compareTo(b.getName()) > 0)
                 return 1;
             else if(a.getName().compareTo(b.getName()) < 0)
                 return -1;
             else{
               if(a.getID() < b.getID())
                  return 1;
               else
                   return -1;
              }
        }
        else 
            return 0;
     } 
    
     public List<Student> getStudents(List<String> events){   
        List<Student> sList = new ArrayList<Student>();      
        Comparator<Student> comparator = new Priorities();
        PriorityQueue<Student> queue = new PriorityQueue<Student>(1000, comparator);
         
        for (String s : events){
            if(s.length() > 6){
                String[] splited = s.split(" ");
                queue.add(new Student(Integer.parseInt(splited[3]), splited[1], Double.parseDouble(splited[2])));
            }
            else{
               if(queue.size() > 0)
                    queue.remove(); 
            } 
        }
        int queueSize = queue.size();
        if(queueSize > 0 ){
            for (int i = 0; i < queueSize; i++){
                sList.add(queue.remove());  
            }
        }
        return sList;
     }
}
