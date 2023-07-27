package tree;

public class tree {
    public static void main(String[] args) {
        treeNode root = new treeNode(1);
        treeNode rightNode = new treeNode(2);
        treeNode leftNode = new treeNode(3);

        root.leftNode = leftNode;
        root.rightNode = rightNode;
    }
}
