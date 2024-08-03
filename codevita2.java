import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codevita2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List <Integer> him=new ArrayList<>();
        
        System.out.println("enter the max price");
        int n=sc.nextInt();
 int count=0;
 while(n>0){
    int a=n/2;
 
    n=n/2;
    count++;
 }
 System.out.println("total number "+count+" numbers are "+him);
 


    }
    
}
