public class privte {
    public static void main(String[] args) {
        student s1=new student();
        s1.setName("himanshu");
        System.out.println(s1.getName());

        
    }
    
}
class student {
private int roll;
private String name;
public void  setName(String name) {
    this.name=name;
}
public String getName(){
    return name;
}
public void  setRoll(int roll) {
    this.roll=roll;
}
public int getRoll(){
    return roll;
}
}