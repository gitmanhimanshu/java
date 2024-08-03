public class oops {
    public static void main(String[] args) {
    student him=new student();
    teacher ch=new teacher();
    ch.name="chandan";
    ch.salary="798";
    System.out.println(ch.salary);
        
    
        
    }
}
 class student{
    String name;
    String coarse;
    String branch;
    
    
}
class teacher extends student {
  
    String salary;
}

