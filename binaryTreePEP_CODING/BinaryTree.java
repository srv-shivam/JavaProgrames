package binaryTreePEP_CODING;

import java.util.Stack;

public class BinaryTree {

    private Node root;

    BinaryTree() {
        this.root = null;
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    void constructBinaryTree(Integer[] nodes) {

        root = new Node(nodes[0]); // pointing first array element to root
        Pair pairNode = new Pair(root, 1);

        Stack<Pair> stack = new Stack<>();
        stack.push(pairNode);

        int idx = 0;
        while (!stack.isEmpty()) {
            Pair top = stack.peek();

            if (top.state == 1) {
                ++idx;
                ++top.state;
                if (nodes[idx] != null) {
                    Node newNode = new Node(nodes[idx]); // creating new Node
                    top.node.left = newNode; // as state is 1 so pointing the created node to the left of top
                    Pair newPair = new Pair(newNode, 1);
                    stack.push(newPair);
                }

            } else if (top.state == 2) {
                ++idx;
                ++top.state;
                if (nodes[idx] != null) {
                    Node newNode = new Node(nodes[idx]);
                    top.node.right = newNode;
                    Pair newPair = new Pair(newNode, 1);
                    stack.push(newPair);
                }

            } else {
                stack.pop();
            }
        }
    }

    void inOder(Node root) {
        if (root == null) return;
        inOder(root.left);
        System.out.print(root.data + " ");
        inOder(root.right);
    }

    public static void main(String[] args) throws Exception {
        // Integer array of nodes to create Binary Tree
        Integer[] nodes = {50, 12, 10, null, null, 15, 20, null, null, null, 75, 62, null, 72, null, null, 80, null, null};

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.constructBinaryTree(nodes);
        binaryTree.inOder(binaryTree.root);
    }
}
