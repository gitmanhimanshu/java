import java.util.Scanner;

public class sachin {
    node root;
    public static void main(String[] args) {
        sachin h=new sachin();
        h.root=null;
int c=1;
Scanner sc=new Scanner(System.in);
while(c==1){
    System.out.println("enter the data");
    int data=sc.nextInt();
    h.root=h.create(data, h.root);
    System.out.println(" 1= more");
    c=sc.nextInt();
}
h.inorder(h.root);

    }
    void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    node create(int data,node root){
        if(root==null){
            root=new node(data);
            return root;
        }
        if(data>root.data){
            root.right=create(data, root.right);
        }
        else{
            root.left=create(data, root.left);
        }
        return root;
    }
    
}
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
