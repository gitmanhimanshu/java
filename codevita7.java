import java.util.Scanner;

public class codevita7 {
    public static void main(String[] args) {
        System.out.println("entr the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int five=(n-4)/5;
        n=n-5*five;
        int two=(n-1)/2;
        n=n-2*two;
        int one=n;
        System.out.println((one+two+five)+" "+five+" "+two+" "+one);
    }
}
