import java.util.Scanner;

public class tree {

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

} 

Node create()
{ 
    System.out.println("enter the data");
    Scanner sc=new Scanner(System.in);
int data=sc.nextInt();
if(data==-1)
{
    return null;
}
Node ptr=new Node(data);
System.out.println("enter the left chile of "+ptr.data);
ptr.left=create();
System.out.println("enter the right chile of "+ptr.data);
ptr.right=create();

return ptr;
    

}
void inorder(Node root){
    if(root==null){
        return;
    }
    else{
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
public static void main(String[] args) {
    tree l=new tree();
    Node root=null;

    
    root=l.create();

 l.inorder(root);       
    }
    
}
