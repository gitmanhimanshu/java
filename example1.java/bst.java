import java.rmi.NotBoundException;
import java.util.Scanner;

import javax.swing.text.InternationalFormatter;

public  class bst {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
       
            right=null;
        }
        
    }
    public static Node insert(Node root,int data){
      
      if(root==null){
        root=new Node(data);
        return root;
      }
      if(root.data>data){
        root.left=insert(root.left, data);
      }
      else{
        root.right=insert(root.right,data);
      }
      return root;
    }
    public static void inorder(Node root){
      if(root==null){
        return;
      }
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);
    }
 public static void main(String[] args) {
  bst a=new bst();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of elemets");
  int n=sc.nextInt();
  int values[]=new int[n];
  System.out.print("enter the elements");
  for(int i=0;i<n;i++){
    values[i]=sc.nextInt();
  }
  Node root=null;
  for(int i=0;i<values.length;i++){
    root=insert(root, values[i]);

  }
  System.out.println(" inorder=");
  inorder(root);
 }
  }  

