package Tree;

import java.util.Scanner;

public class BinaryTree {

    class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    private static Node root;

    public BinaryTree() {
    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {

        System.out.println("Do you want to enter the left of Node " + node.value);
        boolean isLeft = scanner.nextBoolean();
        if (isLeft) {
            System.out.println("Enter the value of the left of Node " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right of Node " + node.value);
        boolean isRight = scanner.nextBoolean();
        if (isRight) {
            System.out.println("Enter the value of the right of Node " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.value);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        System.out.println("\n");
        tree.display();
    }

}
