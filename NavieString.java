import java.util.Scanner;

public class NavieString {
    public static void main(String[] args) {
        char T[]=new char[50];
        char P[]=new char[50];
        System.out.println("enter the length if T ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the String");
        for(int i=1;i<=n;i++)
        {      T[i]=sc.next().charAt(i);
        }
        System.out.println("enter the length of P");
        int m=sc.nextInt();
        System.out.println("enter the P String ");
        for(int i=1;i<=m;i++){
            P[i]=sc.next().charAt(i);
        }
        NavieString h=new NavieString();
        h.naviematcher(T, P, n, m);
    }
    void naviematcher(char []T,char[]P,int n,int m){
        for(int s=0;s<=n-m;s++){
            int a=0;
            for(int i=1;i<=m;i++){
                if(P[i]!=T[s+i]){
                    a++;
                }
            }
            if(a==0){
                System.out.println("pattern found at "+ s);
            }
        }
    }
    
}
