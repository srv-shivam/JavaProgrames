package binaryTreePEP_CODING;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private static Node root;

    BinaryTree() {
        root = null;
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

    static void constructBinaryTree(Integer[] nodes) {

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

    static void displayTree(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        str += (node.left == null ? ". " : node.left.data);
        str += (" <- " + node.data + " -> ");
        str += (node.right == null ? ". " : node.right.data);

        System.out.println(str);

        displayTree(node.left);
        displayTree(node.right);
    }

    /**
     * Calculating height (count of nodes) of Binary Tree
     *
     * @return totalSize
     */
    static int size(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSize = size(node.left);
        int rightSize = size(node.right);

        return (leftSize + rightSize + 1);
    }

    /**
     * Calculating sum of nodes of Binary Tree
     *
     * @return totalSum
     */
    static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSum = sum(node.left);
        int rightSum = sum(node.right);

        return (leftSum + rightSum + node.data);
    }

    /**
     * Calculating maximum node of Binary Tree
     *
     * @return maxNode
     */
    static int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = max(node.left);
        int rightMax = max(node.right);

        return (Math.max(node.data, Math.max(leftMax, rightMax)));
    }

    /**
     * Calculating height of the Binary Tree
     *
     * @return height
     */
    static int height(Node node) {
        if (node == null) {
            return -1;  // If height is calculated by edges
            //return 0  // If height is calculated by nodes
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return (Math.max(leftHeight, rightHeight) + 1);
    }

    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    /**
     * Method for Level Order Traversal of Binary Tree
     * IMPORTANT: RPC (Remove node, print that node, then add child of removed node)
     */
    static void levelOrderTraversal(Node node) {
        if (node == null)
            return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int count = queue.size();

            for (int i = 0; i < count; i++) {
                node = queue.remove();
                System.out.print(node.data + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println();
        }
    }

    static void levelWiseSum(Node node) {
        if (node == null)
            return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        int a = 0;

        while (!queue.isEmpty()) {
            int sum = 0;
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                node = queue.remove();
                sum += node.data;

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            System.out.println("Level " + (++a) + " sum -> " + sum);
        }
    }

    static void iterativeTraversal(Node node) {
        if (node == null)
            return;

        StringBuilder preOrder = new StringBuilder();
        StringBuilder inOrder = new StringBuilder();
        StringBuilder postOrder = new StringBuilder();

        Stack<Pair> stack = new Stack<>();
        Pair rootPair = new Pair(node, 1);

        stack.push(rootPair);

        while (!stack.isEmpty()) {
            Pair top = stack.peek();

            if (top.state == 1) {
                preOrder.append(top.node.data).append(" ");
                ++top.state;

                if (top.node.left != null) {
                    Pair newPair = new Pair(top.node.left, 1);
                    stack.push(newPair);
                }

            } else if (top.state == 2) {
                inOrder.append(top.node.data).append(" ");
                ++top.state;

                if (top.node.right != null) {
                    Pair newPair = new Pair(top.node.right, 1);
                    stack.push(newPair);
                }
            } else {
                postOrder.append(top.node.data).append(" ");
                stack.pop();
            }
        }

        System.out.println("\nPreOrder : " + preOrder);
        System.out.println("InOrder : " + inOrder);
        System.out.println("PostOrder : " + postOrder);
    }

    static void levelWiseGreater(Node root) {
        if (root == null) return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int a = 1;

        while (!queue.isEmpty()) {
            int count = queue.size();
            int greater = queue.peek().data;

            for (int i = 0; i < count; i++) {
                Node current = queue.remove();
                greater = Math.max(current.data, greater);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println("Level " + a + " -> " + greater);
            ++a;
        }
    }

    public static void main(String[] args) throws Exception {
        // Integer array of nodes to create Binary Tree
        Integer[] nodes = {50, 25, 92, null, null, 37, 70, null, null, null, 75, 62, null, 30, null, null, 87, null, null};

        constructBinaryTree(nodes);
        System.out.println("Binary Tree in Euler-> ");
        displayTree(root);

        System.out.println("\nSize of Binary Tree : " + size(root));
        System.out.println("Sum of nodes of Binary Tree : " + sum(root));
        System.out.println("Maximum node of Binary Tree : " + max(root));
        System.out.println("Height of Binary Tree : " + height(root));

        System.out.print("\nPreOrder Traversal of Binary tree ");
        preOrder(root);

        System.out.print("\nInOrder Traversal of Binary tree ");
        inOrder(root);

        System.out.print("\nPostOrder Traversal of Binary tree ");
        postOrder(root);

        System.out.print("\n\nLevel Order Traversal of Binary Tree : \n");
        levelOrderTraversal(root);

        System.out.println("\nLevel Wise Sum : ");
        levelWiseSum(root);

        System.out.print("\nIterative Traversal : ");
        iterativeTraversal(root);

        System.out.println("\nLevelWise Greater Element : ");
        levelWiseGreater(root);
    }
}
