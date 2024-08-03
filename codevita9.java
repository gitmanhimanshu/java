import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codevita9 {
    public static void main(String[] args) {
        int sample[]=new int[50],s,t,l1,l2;
        List<Integer>him=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sample size ");
         s=sc.nextInt();
         System.out.println("enter the ranges ");
         t=sc.nextInt();
         System.out.println("enter the samples");
         for(int i=0;i<s;i++){
            sample[i]=sc.nextInt();
         }
         for(int i=1;i<=t;i++){
            int c=0;
            System.out.println("enter the "+i+" range ");
            l1=sc.nextInt();
            l2=sc.nextInt();
            for(int j=0;j<s;j++){
                if(sample[j]>=l1&&sample[j]<=l2){
                    c++;
                }
            }
            him.add(c);
         }
         System.out.println(him);

    }
}
