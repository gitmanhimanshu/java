import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codevita4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n1");
        int n1=sc.nextInt();
        System.out.println("enter the n2");
        int n2=sc.nextInt();
        List<Integer> him=new ArrayList<>();
      List<Integer> him1=new ArrayList<>();
        for(int i=n1;i<=n2;i++){
            if(isprime(i)){
                him.add(i);
            }
        }
for(Integer i: him){
    for(Integer j: him){
        int c=Integer.parseInt(Integer.toString(i)+Integer.toString(j));
        if(isprime(c)&&!ispresent(him1,c)){
            him1.add(c);
        }
    }
   
}
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(Integer i: him1){
    if(i>max){
        max=i;
    }
    if(i<min){
        min=i;
    }
}
System.out.println("max= "+max+" min= "+min);
long a=min;
long b=max;
long next=0;
for(int i=1;i<him1.size()-1;i++){
    next=a+b;
    a=b;
    b=next;
}
System.out.println("34th fibonocci element is "+next);


    }
    static boolean ispresent(List<Integer> him1,int c){
        int a=0;
     for(Integer i: him1){
        if(i==c){
            a++;
            break;
        }
     }
     if(a==0){
        return false;
     }
     else{
        return true;
     }
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
