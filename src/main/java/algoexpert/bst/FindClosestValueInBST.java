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
    BST root = new BST(100);
    BST L1 = new BST(5);
    BST R1 = new BST(502);
    root.left= L1;
    root.right= R1;
    //BST L21 = new BST(2);
    //BST L22 = new BST(5);
    //L1.left=L21;
    //L1.right =L22;
    R1.left = new BST(204);
    R1.right= new BST(55000);
    R1.left.left= new BST(203);
    R1.left.right= new BST(205);
    R1.right.left= new BST(1001);
    R1.right.left.right= new BST(4500);
    System.out.println(findClosestValueInBst(root,2000));
  }

  static int closest;
  public static int findClosestValueInBst(BST tree, int target) {
    closest = tree.value;
    doFindClosestValueInBst(tree,target);
    return closest;
  }

  public static void doFindClosestValueInBst(BST tree, int target) {

    if (tree == null) {
      return;
    }
    int val = tree.value;
    int currentDiff = Math.abs(val- target);
    int closestDiff = Math.abs(closest-target);
    if(currentDiff < closestDiff) {
      closest = val;
    }

    if(target < tree.value) {
      doFindClosestValueInBst(tree.left,target);
    } else  if(target > tree.value) {
      doFindClosestValueInBst(tree.right,target);
    }else{
      closest = val;
      return;
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
