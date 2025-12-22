package algoexpert.bst;

import java.util.Arrays;
import java.util.List;

import static java.util.Objects.nonNull;

public class MinHeightBST {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,7,10,13,14,15,22);
        BST bst = minHeightBst(list);
        System.out.println();
    }

    public static BST minHeightBst(List<Integer> array) {
        return createMinHeightBST(array,0,array.size()-1);
    }

    public static BST createMinHeightBST(List<Integer> array, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start+end)/2;

        BST tree = new BST(array.get(mid));

        BST leftSubTree = createMinHeightBST(array,start,mid-1);
        if(nonNull(leftSubTree)) {
            tree.left = leftSubTree;
        }

        BST rightSubTree = createMinHeightBST(array,mid+1,end);
        if(nonNull(rightSubTree)) {
            tree.right = rightSubTree;
        }

        return tree;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
