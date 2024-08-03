import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class bst2 {
    static class Node {
        int data;
        Node left ,right;
        Node(int val)
        {
   this.data=val;
 this.left=null;
   this.right=null;
        }
    } 
    static void inorder(Node root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    static Node create(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(root.data<data){
            root.right=create(root.right,data);
        }
        else{
            root.left=create(root.left, data);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Node root=null;
        for(int i=0;i<n;i++){
            root=create(root,a[i]);
        }
inorder(root);
    }
}
