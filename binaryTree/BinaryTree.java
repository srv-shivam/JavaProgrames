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

    public TreeNode createBinaryTree() {

        System.out.print("Enter data : ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new TreeNode(data);

        System.out.print("Enter left node for " + data + "\n");
        root.left = createBinaryTree();

        System.out.print("Enter right node for " + data + "\n");
        root.right = createBinaryTree();

        return root;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
    }
}
