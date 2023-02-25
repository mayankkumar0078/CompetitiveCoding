package algoexpert.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *   Write a function that takes in a Binary Tree and returns a list of its branch
 *   sums ordered from leftmost branch sum to rightmost branch sum.
 * </p>
 * <p>
 *   A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
 *   branch is a path of nodes in a tree that starts at the root node and ends at
 *   any leaf node.
 * </p>
 * <p>
 *   A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
 *   branch is a path of nodes in a tree that starts at the root node and ends at
 *   any leaf node.
 * </p>
 *
 * <pre><span class="CodeEditor-promptParameter">tree</span> =
 *            1
 *         /     \
 *        2       3
 *      /   \    /  \
 *     4     5  6    7
 *   /   \  /
 *  8    9 10
 * </pre>
 *
 * <pre>[15, 16, 18, 10, 11]
 * <span class="CodeEditor-promptComment">// 15 == 1 + 2 + 4 + 8</span>
 * <span class="CodeEditor-promptComment">// 16 == 1 + 2 + 4 + 9</span>
 * <span class="CodeEditor-promptComment">// 18 == 1 + 2 + 5 + 10</span>
 * <span class="CodeEditor-promptComment">// 10 == 1 + 3 + 6</span>
 * <span class="CodeEditor-promptComment">// 11 == 1 + 3 + 7</span>
 * </pre>
 */
public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sumList = new ArrayList<Integer>();
        doBranchSum(root,0,sumList);

        return sumList;
    }

    private static void doBranchSum(BinaryTree root,int currentSum, List<Integer> sumList) {
        if(root == null) {
            sumList.add(currentSum);
            return;
        }
        doBranchSum(root.left,currentSum+root.value,sumList);
        doBranchSum(root.right,currentSum+root.value,sumList);
    }
}
