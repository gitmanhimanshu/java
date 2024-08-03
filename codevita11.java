import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codevita11 {
    public static void main(String[] args) {
        System.out.println("enter the String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<String> him=new ArrayList<>();
        for(int i=0;i<s.length();i++){
             String c =""+s.charAt(i);
             for(int j=0;j<s.length();j++){
                if(i==j){
                    continue;
                }
                else{
                    c=c+s.charAt(j);
                }
             }
             him.add(c);
        }
        System.out.println(him);
    }
}
