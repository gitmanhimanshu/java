import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codevita12 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the N");
        int N=sc.nextInt();
        System.out.println("enter the String");
        String s=sc.next();
        System.out.println("enter the queries");
        int q=sc.nextInt();
        List<Integer> him=new ArrayList<>();
        for(int i=1;i<=q;i++){
            System.out.println("enter the position");
            int p=sc.nextInt();
            char m=s.charAt(p-1);
            int c=0;
            for(int j=p-2;j>=0;j--){
                    if(s.charAt(j)==m){
                        c++;
                    }
            }
            him.add(c);
        }
        System.out.println(him);
    }
}
