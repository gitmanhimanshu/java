import java.util.Deque;
import java.util.Scanner;

public class qlist {
    class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        next=null;
        }

    }
    Node front=null;
    Node rear=null; 
    boolean isempty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }

    }
    void enque(int data){
Node ptr=new Node(data);
if(isempty()){
    front=rear=ptr;
}
else{
    rear.next=ptr;
    rear=ptr;

}

    }
    void deque(){
        if(isempty())
        {
            System.out.println("no data");
        }
        else{
            front=front.next;
        }
    }
void show(){
if(isempty()){
    System.out.println("no elemnwnts");
}
else{
    Node i=front;
    while(i!=null){
        System.out.println(i.data);
        i=i.next;
    }

}
}
public static void main(String[] args) {
qlist l=new qlist();
Scanner sc=new Scanner(System.in);
while(true){
    System.out.println("1=enque  2= deque");
 int ch=sc.nextInt();
 switch(ch){
    case 1: System.out.println("enter the data");
    int data=sc.nextInt();
    l.enque(data);
    break;
    case 2: l.deque();
    break;
    case 3: l.show();
    break;
    case 4: return;
 }
}    
}
}
