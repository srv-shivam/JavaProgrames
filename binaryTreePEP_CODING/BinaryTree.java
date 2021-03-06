package binaryTreePEP_CODING;

import java.util.*;

/**
 * Binary Tree in use
 * <p>
 * 10
 * /  \
 * 8     12
 * /  \   /  \
 * 6   9  11  13
 * \
 * 7
 * / \
 * 5   4
 */

public class BinaryTree {

    private static Node root;
    private static ArrayList<Integer> path;
    private static ArrayList<Node> path2;
    private static int diameter = 0;
    private static int countOfTwoChildNode = 0;

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
        if (node == null) return;

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
        if (node == null) return;

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
        if (node == null) return;

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

        System.out.println("\nIterative PreOrder Traversal : " + preOrder);
        System.out.println("Iterative InOrder Traversal : " + inOrder);
        System.out.println("Iterative PostOrder Traversal : " + postOrder);
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

    /**
     * Method to find given element in Binary Tree
     *
     * @param node root of Binary tree
     * @param data element to search in the Binary Tree
     * @return true|false
     */
    static boolean findElementInBinaryTree(Node node, int data) {

        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        }

        boolean leftChild = findElementInBinaryTree(node.left, data);
        if (leftChild) return true;

        boolean rightChild = findElementInBinaryTree(node.right, data);
        if (rightChild) {
            return true;
        }

        return false;
    }

    /**
     * Method to find the path from the given node to the root of th Binary Tree
     *
     * @param node root of the Binary Tree
     * @param data element of whose path from root is to search
     * @return true|false
     */
    static boolean pathFromRootToNode(Node node, int data) {

        if (node == null) {
            return false;
        }

        if (node.data == data) {
            path.add(node.data);
            return true;
        }

        boolean toLeftChild = pathFromRootToNode(node.left, data);
        if (toLeftChild) {
            path.add(node.data);
            return true;
        }

        boolean toRightChild = pathFromRootToNode(node.right, data);
        if (toRightChild) {
            path.add(node.data);
            return true;
        }

        return false;
    }

    static void printKthLevel(Node node, int k) {

        if (node == null) return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        int level = -1;
        boolean flag = false;

        while (!queue.isEmpty()) {
            int count = queue.size();
            ++level;
            if (flag) return;

            for (int i = 0; i < count; i++) {
                Node current = queue.remove();

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }

                if (level == k) {
                    System.out.print(current.data + " ");
                    flag = true;
                }
            }
        }

    }

    static void printKLevels(Node node, int k) {

        if (node == null || k < 0) return;

        if (k == 0) {
            System.out.print(node.data + " ");
        }

        printKLevels(node.left, k - 1);
        printKLevels(node.right, k - 1);
    }

    /******************************************************************************************************************/

    static boolean pathFromRootToNode2(Node node, int data) {

        if (node == null) {
            return false;
        }

        if (node.data == data) {
            path2.add(node);
            return true;
        }

        boolean toLeftChild = pathFromRootToNode2(node.left, data);
        if (toLeftChild) {
            path2.add(node);
            return true;
        }

        boolean toRightChild = pathFromRootToNode2(node.right, data);
        if (toRightChild) {
            path2.add(node);
            return true;
        }

        return false;
    }

    static void printKLevelsDown(Node node, int k, Node blocker) {

        if (node == null || k < 0 || blocker == node) return;

        if (k == 0) {
            System.out.print(node.data + " ");
        }

        printKLevelsDown(node.left, k - 1, blocker);
        printKLevelsDown(node.right, k - 1, blocker);
    }

    static void printKNodesFar(Node node, int data, int k) {

        // This part will find the path from the given data to the root node
        // path will be saved into path ArrayList
        path2 = new ArrayList<>();
        pathFromRootToNode2(node, data);

        for (int i = 0; i < path2.size(); ++i) {
            printKLevelsDown(path2.get(i), k - i, i == 0 ? null : path2.get(i - 1));
        }

    }

    /**
     * Method to print the leftView of the Binary Tree
     *
     * @param node root of the Binary Tree
     */
    static void printLeftView(Node node) {

        if (node == null) return;

        LinkedList<Node> queue = new LinkedList<>();
        queue.addFirst(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print(queue.getFirst().data + " ");

            while (size-- > 0) {
                Node current = queue.removeFirst();
                if (current.left != null) queue.addLast(current.left);
                if (current.right != null) queue.addLast(current.right);
            }
        }
    }

    /**
     * Method to print the right view of the Binary Tree
     *
     * @param node root of the Binary Tree
     */

    static void printRightView(Node node) {

        if (node == null) return;

        LinkedList<Node> queue = new LinkedList<>();
        queue.addFirst(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node current = null;
            while (size-- > 0) {
                current = queue.remove();
                if (current.left != null) queue.addLast(current.left);
                if (current.right != null) queue.addLast(current.right);
            }
            System.out.print(current.data + " ");
        }
    }

    static void printTopView(Node node) {

        if (node == null) return;
        LinkedList<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Pair pair = new Pair(node, 0);
        queue.addFirst(pair);
        int line;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                Pair current = queue.removeFirst();
                if (!map.containsKey(current.state)) {
                    map.put(current.state, current.node.data);
                }

                if (current.node.left != null) {
                    line = current.state - 1;
                    pair = new Pair(current.node.left, line);
                    queue.addLast(pair);
                }

                if (current.node.right != null) {
                    line = current.state + 1;
                    pair = new Pair(current.node.right, line);
                    queue.addLast(pair);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    static void printBottomView(Node node) {

        if (node == null) return;
        LinkedList<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Pair pair = new Pair(node, 0);
        queue.addFirst(pair);
        int line;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                Pair current = queue.removeFirst();
                map.put(current.state, current.node.data);

                if (current.node.left != null) {
                    line = current.state - 1;
                    pair = new Pair(current.node.left, line);
                    queue.addLast(pair);
                }

                if (current.node.right != null) {
                    line = current.state + 1;
                    pair = new Pair(current.node.right, line);
                    queue.addLast(pair);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    public static Node leftClonedTree(Node node) {

        if (node == null) return null;

        Node leftNode = leftClonedTree(node.left);
        Node rightNode = leftClonedTree(node.right);

        Node newNode = new Node(node.data);
        newNode.left = leftNode;
        node.left = newNode;
        node.right = rightNode;

        return node;
    }

    public static Node rightClonedTree(Node node) {

        if (node == null) return null;

        Node leftNode = rightClonedTree(node.left);
        Node rightNode = rightClonedTree(node.right);

        node.left = leftNode;
        Node newNode = new Node(node.data);
        newNode.right = rightNode;
        node.right = newNode;

        return node;
    }

    public static Node backFromLeftCloned(Node node) {

        if (node == null) return null;

        Node nodeLeft = backFromLeftCloned(node.left.left);
        Node nodeRight = backFromLeftCloned(node.right);

        node.left = nodeLeft;
        node.right = nodeRight;

        return node;
    }

    public static void printSingleChildNode(Node node) {

        if (node == null) return;

        if (node.left == null && node.right != null) {
            System.out.print(node.right.data + " ");
        } else if (node.right == null && node.left != null) {
            System.out.print(node.left.data + " ");
        }

        printSingleChildNode(node.left);
        printSingleChildNode(node.right);
    }

    public static Node removeLeafNode(Node node) {

        if (node == null) return null;

        if (node.left == null && node.right == null) return null;

        node.left = removeLeafNode(node.left);
        node.right = removeLeafNode(node.right);

        return node;
    }

    public static int countLeaves(Node node) {

        if (node == null) return 0;

        if (node.left == null && node.right == null) return 1;

        int leftCount = countLeaves(node.left);
        int rightCount = countLeaves(node.right);

        return leftCount + rightCount;
    }

    public static int getDiameter(Node node) {

        if (node == null) return 0;

        int lDiameter = getDiameter(node.left);  //basically, it will calculate left height for particular node
        int rDiameter = getDiameter(node.right); //basically, it will calculate right height for particular node

        diameter = Math.max(diameter, (1 + lDiameter + rDiameter));

        return (Math.max(lDiameter, rDiameter) + 1);
    }

    public static void getCountOfDoubleChildNode(Node node) {
        if (node == null) return;

        getCountOfDoubleChildNode(node.left);
        getCountOfDoubleChildNode(node.right);

        if (node.left != null && node.right != null) {
            ++countOfTwoChildNode;
        }
    }

    public static void boundaryTraversal(Node node) {

        if (node == null) return;

        printLeftBoundary(node);
        printLeaveBoundary(node);
        printRightBoundary(node.right);
    }

    /*****************************************************************/
    private static void printLeftBoundary(Node node) {
        if (node == null) return;
        else if (node.left == null && node.right == null) return;
        else {
            System.out.print(node.data + " ");
            printLeftBoundary(node.left);
            if (node.left == null && node.right != null)
                printLeftBoundary(node.right);
        }
    }

    private static void printLeaveBoundary(Node node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeaveBoundary(node.left);
        printLeaveBoundary(node.right);
    }

    private static void printRightBoundary(Node node) {
        if (node == null) return;
        else if (node.left == null && node.right == null) return;
        else {
            printRightBoundary(node.right);
            if (node.right == null && node.left != null)
                printRightBoundary(node.left);
            System.out.print(node.data + " ");
        }
    }

    /********************************************************************/

    /**
     * Method to convert the Binary Tree to it's Mirror Image
     *
     * @param node node
     * @return node
     */
    public static void mirrorImage(Node node) {

        if (node == null) return;

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirrorImage(node.left);
        mirrorImage(node.right);
    }

    public static boolean isSymmetric(Node node) {
        if (node == null)
            return true;
        else {
            return areSymmetric(node.left, node.right);
        }
    }

    private static boolean areSymmetric(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        return ((root1.data == root2.data) && (areSymmetric(root1.left, root2.right)) && areSymmetric(root1.right, root2.left));
    }

    private static int helperCountGoodNodes(Node node, int max) {
        if (node == null)
            return 0;

        max = Math.max(max, node.data);
        //calling left part of tree for the count of good nodes in left subtree
        int leftCount = helperCountGoodNodes(node.left, max);
        //calling right part of tree for the count of the good nodes in right subtree
        int rightCount = helperCountGoodNodes(node.right, max);

        if (node.data >= max)
            return (1 + leftCount + rightCount);
        else
            return (leftCount + rightCount);
    }

    /**
     * @param node root
     * @return count of good nodes
     */
    public static int countGoodNodes(Node node) {
        if (node == null)
            return 0;
        // As, root node is always a good node
        if (node.left == null && node.right == null)
            return 1;

        return helperCountGoodNodes(node, Integer.MIN_VALUE);
    }

    static int sumOf = 0;

    /**
     * Method to calculate the sum of the nodes with the even valued parents
     *
     * @param node node
     */
    public static void sumOfNodesWithEvenValuedParent(Node node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            return;

        if (node.left != null && node.right != null && (node.data % 2 == 0)) {
            System.out.println(node.left.data + " <-" + node.data + "-> " + node.right.data);
            sumOf = sumOf + node.left.data + node.right.data;
        } else if (node.left != null && (node.data % 2 == 0)) {
            System.out.println(node.left.data + " <-" + node.data + "-> .");
            sumOf = sumOf + node.left.data;
        } else if (node.right != null && (node.data % 2 == 0)) {
            System.out.println(". <-" + node.data + "-> " + node.right.data);
            sumOf = sumOf + node.right.data;
        }

        sumOfNodesWithEvenValuedParent(node.left);
        sumOfNodesWithEvenValuedParent(node.right);
    }

    public static int minHeightOfTree(Node node) {

        //When node == null we should return 0 as ideally, but for this logic we can
        //perform node == null condition in the driver function and directly return 0
        //at that time
        if (node == null)
            return Integer.MAX_VALUE;
        if (node.left == null && node.right == null)
            return 1;
        return (1 + Math.min(minHeightOfTree(node.left), minHeightOfTree(node.right)));
    }

    public static void printAllRootToNodePath(Node node, ArrayList<Integer> path) {

        if (node == null)
            return;
        path.add(node.data);

        if (node.left == null && node.right == null) {
            System.out.println(path);
        } else {
            printAllRootToNodePath(node.left, path);
            printAllRootToNodePath(node.right, path);
        }
        path.remove(path.size() - 1);
    }

    private static int check(Node node) {
        if (node == null) return 0;

        int lh = check(node.left);
        int rh = check(node.right);

        if (lh == -1 || rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;

        return (1 + Math.max(lh, rh));
    }

    public static boolean isBalanced(Node node) {

        if (node == null) return false;

        return check(node) != -1;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Integer array of nodes to create Binary Tree
        Integer[] nodes = {
                /*1, 2, null, null, 3, null, null*/
                3, 1, 3, null, null, null, 4, 1, null, null, 5, null, null
                /*1, 2, 4, 8, 18, null, null, null, 9, null, null,
                5, 6, 16, null, null, 17, null, null, 7, null, null,
                3, 10, null, null, 11, 13, 15, null, null, 14, null, null, null*/
                /*10, 8, 6, null, 7, 5, null, null, 4, null, null,
                9, null, null, 12, 11, null, null, 13, null, null*/
                /*1, 2, 4, 6, null, null, 7, null, null, 5, 8, 12, null, null, 15,
                null, null, 9, 14, 16, 20, 29, null, null, 30, null, null,
                21, 22, null, null, 23, null, null, 17, 31, 28, null, null,
                27, null, null, null, 13, 18, 24, null, null, 25, null, null,
                19, null, null, 3, 10, null, null, 11, null, null*/};

        constructBinaryTree(nodes);
        System.out.println("Binary Tree in Euler-> ");
        displayTree(root);

        System.out.println("\nSize of Binary Tree : " + size(root));
        System.out.println("Sum of nodes of Binary Tree : " + sum(root));
        System.out.println("Maximum node of Binary Tree : " + max(root));
        System.out.println("Height of Binary Tree : " + height(root));
        getDiameter(root);
        System.out.println("Diameter of Binary Tree : " + BinaryTree.diameter);
        System.out.println("Number of leaves in Binary Tree : " + countLeaves(root));
        getCountOfDoubleChildNode(BinaryTree.root);
        System.out.println("Nodes with two children : " + BinaryTree.countOfTwoChildNode);
        System.out.println("Boundary Nodes of Binary Tree : ");
        boundaryTraversal(BinaryTree.root);

        System.out.println("\nCount of Good Nodes of the Binary Tree : " + countGoodNodes(BinaryTree.root));

        System.out.println("\nMinimum height of the Binary Tree : " + minHeightOfTree(BinaryTree.root));
        System.out.println("\nIs Binary Tree Balanced: " + isBalanced(BinaryTree.root));

        sumOfNodesWithEvenValuedParent(BinaryTree.root);
        System.out.println("Sum of nodes with even valued parent : " + sumOf);

        System.out.println("\nAll Paths from root to leaf : ");
        printAllRootToNodePath(BinaryTree.root, new ArrayList<Integer>());

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

        System.out.println("\nFind an element in Binary Tree :-> ");
        System.out.print("Enter number to search : ");
        int data = sc.nextInt();
        if (findElementInBinaryTree(BinaryTree.root, data)) {
            System.out.print("Found Element " + data + " in Binary Tree!!");
        } else {
            System.out.print("Not Found Element " + data + " in Binary Tree!!");
        }

        path = new ArrayList<>();

        System.out.println("\nFind Path from NODE to ROOT : ");
        if (pathFromRootToNode(BinaryTree.root, data)) {
            System.out.println("\nPath is : " + path);
        } else {
            System.out.println("Element does not exist!!");
        }

        System.out.println("\nPrinting all Kth Level elements from root : ");
        System.out.print("Enter Level to print : ");
        int k = sc.nextInt();
        printKthLevel(BinaryTree.root, k);
        System.out.println();
        printKLevels(BinaryTree.root, k); // another way to print Kth level of Binary tree

        System.out.println("\n\nPrinting all nodes K far away from given Node " + data);
        printKNodesFar(BinaryTree.root, data, k);

        System.out.print("\nPrint Left View of the Binary Tree ");
        printLeftView(BinaryTree.root);

        System.out.print("\nPrint Right View of the Binary Tree ");
        printRightView(BinaryTree.root);

        System.out.print("\nPrint Top View of the Binary Tree ");
        printTopView(BinaryTree.root);

        System.out.print("\nPrint Bottom View of the Binary Tree ");
        printBottomView(BinaryTree.root);

        System.out.println("\nMirror Image of Binary Tree ");
        mirrorImage(BinaryTree.root);
        levelOrderTraversal(BinaryTree.root);
        System.out.println();
        displayTree(BinaryTree.root);

        /*
         * Vice versa use of lefCloned method and rightCloned method
         * for better understanding
         */
        System.out.println("\nLeft Cloned Binary Tree : ");
        leftClonedTree(BinaryTree.root);

//        System.out.println("\nRight Cloned Binary Tree : ");
//        rightClonedTree(BinaryTree.root);

        System.out.println("\nNew left cloned tree : ");
        displayTree(BinaryTree.root);

        System.out.println("\nBack from Left Cloned Binary Tree : ");
        backFromLeftCloned(BinaryTree.root);

        System.out.println("\nNew left cloned tree : ");
        displayTree(BinaryTree.root);

        System.out.println("\nPrint single child nodes : ");
        printSingleChildNode(BinaryTree.root);

        System.out.println("\nBinary Tree after leave nodes removal : ");
        removeLeafNode(BinaryTree.root);
        displayTree(BinaryTree.root);
    }
}