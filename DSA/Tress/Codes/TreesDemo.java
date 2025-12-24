package DSA.Tress.Codes;

import java.util.LinkedList;
import java.util.Queue;

public class TreesDemo {

    static void inOrder(TreeNode root){

        if(root == null) return;
       
        inOrder(root.left);
        System.out.print( "->" + root.data );
        inOrder(root.right);

    }

    static void preOrder(TreeNode root){

        if(root == null) return;
       
        System.out.print( "->" + root.data );
        preOrder(root.left);
        preOrder(root.right);

    }

    static void postOrder(TreeNode root){

            if(root == null) return;
        
            postOrder(root.left);
            postOrder(root.right);
            System.out.print( "->" + root.data );
    }

   

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.print("preorder: ");
        preOrder(root);

        System.out.println();

        System.out.print("Inorder: ");
        inOrder(root);

        System.out.println();

        System.out.print("postorder: ");
        preOrder(root);


        System.out.println();
        System.out.println("Level Order Traversal");
        levelOrder(root);

  

    }
}
