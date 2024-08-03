import java.util.Scanner;

public class LL {
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
        }
    }
    class create{

    }
    public static void main(String[] args) {
        LL list=new LL();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter the data  -1 for no node");
            String dat=sc.nextLine();
            if(dat.equals(-1)){
                break;
            }
            else 
            {
                Node newNode=new Node(dat);
            }
        }
    }
}
