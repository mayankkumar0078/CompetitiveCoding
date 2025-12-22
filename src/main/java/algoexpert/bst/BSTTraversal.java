package algoexpert.bst;

import java.util.ArrayList;
import java.util.List;



public class BSTTraversal {

    public static void main(String[] args) {
        BST root = new BST(100);
        root.left = new BST(50);
        root.right = new BST(150);
        root.left.left = new BST(30);
        root.left.right = new BST(36);
        root.right.right = new BST(2000);
        root.right.left = new BST(120);
        List<Integer> inOrder = inOrderTraverse(root,new ArrayList<>());
        List<Integer> preOrder = preOrderTraverse(root,new ArrayList<>());
        List<Integer> postOrder = postOrderTraverse(root,new ArrayList<>());
        System.out.println();
    }
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if(tree == null) {
            return array;
        }


        inOrderTraverse(tree.left,array);
        array.add(tree.value);
        inOrderTraverse(tree.right,array);
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        if(tree == null) {
            return array;
        }

        array.add(tree.value);
        preOrderTraverse(tree.left,array);

        preOrderTraverse(tree.right,array);
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if(tree == null) {
            return array;
        }


        postOrderTraverse(tree.left,array);

        postOrderTraverse(tree.right,array);
        array.add(tree.value);
        return array;
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
