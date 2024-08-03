import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codevita3 {
    public static void main(String[] args) {
       System.out.println("enter the number");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0;
       List<Integer>him=new ArrayList<>();
       for(int i=2;i<=n;i++){
        
        if(isprime(i)){
            him.add(i);

        }
       }
       int sum=0;
for (Integer i : him) {
    sum=sum+i;
    if(sum>n){
        break;
    }
    if(isprime(sum)&&sum>2){
        a++;
        System.out.println(sum);
    }
}
       System.out.println(a);

    }
    static boolean isprime(int n){
        int a=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a++;
                break;
            }
        }
        if(a==0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
