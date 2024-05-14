package Tree;

public class Test {

    public static void main(String[] args) {
        int[] nums = {6, 2, 9, 4, 8, 1, 3, 5, 7};
        BinarySearchTree tree = new BinarySearchTree();
        tree.populate(nums);
        tree.display();

        System.out.println("\nPre-order : ");
        tree.preOrder();

        System.out.println("\nIn-order : ");
        tree.inOrder();

        System.out.println("\nPost-order : ");
        tree.postOrder();
    }

}
