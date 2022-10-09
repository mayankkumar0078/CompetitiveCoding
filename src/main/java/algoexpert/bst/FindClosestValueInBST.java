package algoexpert.bst;

/**
 * Find Closest Value In BST

 *   Write a function that takes in a Binary Search Tree (BST) and a target integer
 *   value and returns the closest value to that target value contained in the BST.
 You can assume that there will only be one closest value.</p>
 * <p>
 *   Each <span>BST</span> node has an integer <span>value</span>, a
 *   <span>left</span> child node, and a <span>right</span> child node. A node is
 *   said to be a valid <span>BST</span> node if and only if it satisfies the BST
 *   property: its <span>value</span> is strictly greater than the values of every
 *   node to its left; its <span>value</span> is less than or equal to the values
 *   of every node to its right; and its children nodes are either valid
 *   <span>BST</span> nodes themselves or <span>None</span> / <span>null</span>.
 * </p>
 * Sample Input: 12
            10
 *        /     \
 *       5      15
 *     /   \   /   \
 *    2     5 13   22
 *  /           \
 * 1            14
 *
 * Sample Output 13
 */
public class FindClosestValueInBST {



  public static void main(String[] args) {
    BST root = new BST(10);
    BST L1 = new BST(5);
    BST R1 = new BST(15);
    root.left= L1;
    root.right= R1;
    BST L21 = new BST(2);
    BST L22 = new BST(5);
    L1.left=L21;
    L1.right =L22;
    BST L31 = new BST(1);
    L21.left=L31;
    BST R21 = new BST(13);
    R1.left=R21;
    BST R32 = new BST(22);
    R1.right=R32;
    BST R31 =new BST(14);
    R21.left=R31;
    System.out.println(findClosestValueInBst(root,12));
  }

  static int closest;
  static int diff= Integer.MAX_VALUE;
  public static int findClosestValueInBst(BST tree, int target) {

    doFindClosestValueInBst(tree,target);
    return closest;
  }

  public static void doFindClosestValueInBst(BST tree, int target) {
    int val = tree.value;
    int currentDiff = Math.abs(val- target);


    if(currentDiff < diff) {
      diff = currentDiff;
      closest = val;
    }

    if(target < tree.value && tree.left!=null) {
      doFindClosestValueInBst(tree.left,target);
    } else  if(target > tree.value && tree.right!=null) {
      doFindClosestValueInBst(tree.right,target);
    }
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
