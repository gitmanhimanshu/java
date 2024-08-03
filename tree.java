import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class tree {
    
    public static void main(String[] args) {
        List<Integer> him = new ArrayList<>();
        TreeNode root = null;
        root = create(root);
        // inorder(root);
        // him = rightSideView(root);
        // System.out.println(him);
        if(isCousins(root,4,3)){
                System.out.println("they are cousins");
        }
        else{
            System.out.println("they are not cousins");
        }
    }

    static List<Double> averageOfLevels(TreeNode root) {
        List<Double> him = new ArrayList<>();
        if (root == null) {
            return him;
        }
        Queue<TreeNode> h = new LinkedList<>();
        h.add(root);
        while (!h.isEmpty()) {
            double sum = 0;
            int l = h.size();
            for (int i = 0; i < l; i++) {
                TreeNode c = h.remove();
                sum = sum + c.data;
                if (c.left != null) {
                    h.add(c.left);
                }
                if (c.right != null) {
                    h.add(c.right);
                }
            }
            him.add(sum / l);
        }
        return him;

    }

    static List<Integer> rightSideView(TreeNode root) {
        List<Integer> him = new ArrayList<>();
        if (root == null) {
            return him;
        }
        TreeNode rightmost = root;
        while (rightmost != null) {
            him.add(rightmost.data);
            rightmost = rightmost.right;

        }
        return him;
    }

    static TreeNode create(TreeNode root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        TreeNode newnode = new TreeNode(data);
        System.out.println("enter the left child of " + data);
        newnode.left = create(newnode);
        System.out.println("enetr the right child of " + data);
        newnode.right = create(newnode);
        return newnode;
    }

    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = find(root, x);
        TreeNode yy = find(root, y);
        return level(root, xx, 0) == level(root, yy, 0) && (!issiblings(root, xx, yy));
    }
        static boolean issiblings(TreeNode root,TreeNode x,TreeNode y){
            if(root==null){
                return false;
            }
           return (root.left==x&&root.right==y)||(root.left==y&&root.right==x)||issiblings(root.left, x, y)||issiblings(root.right, x, y);
        }


            static TreeNode find(TreeNode root, int x) {
        if (root == null) {
            return null;
        }
        if (root.data == x) {
            return root;
        }
        TreeNode n = find(root.left, x);
        if (n != null) {
            return n;
        }
        return find(root.right, x);
    }

    static int level(TreeNode root, TreeNode x, int lev) {
        if (root == null) {
            return 0;
        }
        if (root == x) {
            return lev;
        }
        int n = level(root.left, x, lev + 1);
        if (n != 0) {
            return n;
        }
        return level(root.right, x, lev + 1);

    }
    public static int kthSmallest(TreeNode root, int k) {
    

    }

}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}