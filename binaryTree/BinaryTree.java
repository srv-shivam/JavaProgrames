package binaryTree;

import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;
    Scanner sc = new Scanner(System.in);

    public static class TreeNode {
        private TreeNode left;
        private int data;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public BinaryTree() {
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

    public void inOrder(TreeNode root) {

        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

//    void inOrderIterativeTraversal() {
//        if (root == null) return;
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
////        while (!stack.isEmpty()) {
////            TreeNode current;
////            if (current.right != null) {
////                stack.push(current.right);
////            }
////            if (current.left != null) {
////                stack.push(current.left);
////            }
//        }
//    }

    void preOrder(TreeNode root) {

        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void preOrderIterativeTraversal() {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
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

//        binaryTree.inOrder(root);
//        System.out.println();
        System.out.print("Recursive preOrder Traversal : ");
        binaryTree.preOrder(root);
        System.out.println();
        System.out.print("Iterative preOrder Traversal : ");
        binaryTree.preOrderIterativeTraversal();
//        System.out.println();
//        binaryTree.postOrder(root);
    }
}
