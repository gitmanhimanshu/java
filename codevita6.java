import java.util.Scanner;

public class codevita6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements ");
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        int sum=0;
        int c=0;
        
     for(int i=0;i<n-1;i++){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min1ind=0;
       int  min2ind=1;
      for(int j=0;j<n;j++){
            if(a[j]<min1){
                min1=a[j];
                min1ind=j;
            }
                }
                System.out.print("\n"+min1);
            a[min1ind]=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                    if(min2>a[j]){
                        min2=a[j];
                        min2ind=j;
                    }
            }
            System.out.print("\n"+min2);
            sum=min1+min2;
            a[min2ind]=sum;
            c=c+sum;

        }
        System.out.println("total sum "+c);
  
      
        
    }
}
