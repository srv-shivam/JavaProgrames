package binaryTree;

import java.util.Scanner;

public class BinaryTree {

    private TreeNode root;
    Scanner sc = new Scanner(System.in);

    private static class TreeNode {
        private TreeNode left;
        private int data;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    BinaryTree() {
        this.root = null;
    }

    TreeNode createBinaryTree() {

        TreeNode current;
        System.out.print("Enter data : ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        current = new TreeNode(data);

        System.out.print("Enter left node for " + data + "\n");
        current.left = createBinaryTree();

        System.out.print("Enter right node for " + data + "\n");
        current.right = createBinaryTree();

        root = current;
        return root;
    }

    void inOrder(TreeNode root) {

        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void preOrder(TreeNode root) {

        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(TreeNode root) {

        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createBinaryTree();

        binaryTree.inOrder(root);
        System.out.println();
        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.postOrder(root);
    }
}
