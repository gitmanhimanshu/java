import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class codevita5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the kth position");
        int k = sc.nextInt();
       
        int pos = -1;
        List<Integer> him = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                him.add(i);
            }
          
        }
        for(int i=0;i<=him.size()-k;i++){
                pos=i;
                    }
                    if(pos==-1){
                        System.out.println("fator is 1");
                    }
                    else{
                    int ans=him.get(pos);
                    System.out.println(k+"th largest factor is "+ans);
                    }
    }
}
