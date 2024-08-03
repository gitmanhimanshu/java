import java.util.Scanner;

class bst{ TreeNode root=null;
    public static void main(String[] args) {
       
        bst a=new bst();
        int c=1;
        Scanner  sc=new Scanner(System.in);
        a.root=null;
        while(c==1){
            System.out.println("enter the data");
            int data=sc.nextInt();
        a.root=a.insert(a.root,data);
        System.out.print("1=  more ");
        c=sc.nextInt();

        }
        a.inorder(a.root);
    }
    TreeNode insert(TreeNode root,int data){
        if(root==null){
            TreeNode node=new TreeNode(data);
            return node;
        }
        if(data<=root.data){
             root.left=insert(root.left, data); c
        }
        else{
            root.right=insert(root.right, data);
        }
        return root;
    }
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode  right=null;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}