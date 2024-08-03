import java.util.Scanner;

public class codevita1 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String s=sc.nextLine();
        System.out.println("enter the substring");
        String h=sc.nextLine();
        String add="";
        for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                for(int j=0;j<h.length();j++){
                    if(a==h.charAt(j)){
                        add=add+s.charAt(i);
                    }
                }
        }
        System.out.println("string is = "+add);
    }
    
}
