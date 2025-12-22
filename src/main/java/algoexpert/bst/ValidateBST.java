package algoexpert.bst;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class ValidateBST {
    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.left.right.left = new BST(11);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);
        System.out.println(validateBst(root));
    }

    public static boolean validateBst(BST tree) {
        return doValidateBST(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean doValidateBST(BST tree, int min, int max) {
        if(isNull(tree)) {
            return true;
        }
        if(tree.value < min || tree.value >= max) {
            return false;
        }
        return doValidateBST(tree.left,min, tree.value) && doValidateBST(tree.right,tree.value,max);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
