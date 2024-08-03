import java.util.Scanner;

public class codevita10 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the stairs");
    int n=sc.nextInt();
  int a=1;
  int b=1;
  int c=2;
  int next=0;
  for(int i=1;i<n-1;i++){
next=a+b+c;
a=b;
b=c;;c=next;
  }
  System.out.println(next);
}
// static int find_way(int n){
//     if(n==0||n==1){
//         return 1;
//     }
//     else if(n==2){
//         return 2;
//     }
// else{
//  return (find_way(n-3)+find_way(n-2)+find_way(n-1));
// }
    
// }
}
