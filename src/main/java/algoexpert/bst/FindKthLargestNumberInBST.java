package algoexpert.bst;

/**
 * <pre><span class="CodeEditor-promptParameter">tree</span> =   15
 *        /     \
 *       5      20
 *     /   \   /   \
 *    2     5 17   22
 *  /   \
 * 1     3
 * <span class="CodeEditor-promptParameter">k</span> = 3
 * </pre>
 */
public class FindKthLargestNumberInBST {
  static int kVal;
  static int val;

  public static void main(String[] args) {
    BST root = new BST(15);
    BST rl1 = new BST(5);
    BST rr1 = new BST(20);
    root.left=rl1;
    root.right = rr1;

    BST rll1 = new BST(2);
    rl1.left = rll1;

    BST rlr1 = new BST(5);
    rl1.right = rlr1;

    BST rlll1 = new BST(1);
    rll1.left = rlll1;

    BST rllr1 = new BST(3);
    rll1.right = rllr1;

    BST rrl1 = new BST(17);
    rr1.left = rrl1;

    BST rrr1 = new BST(22);
    rr1.right = rrr1;
    int val = findKthLargestValueInBst(root,9);
    System.out.println(val);
  }
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public static int findKthLargestValueInBst(BST tree, int k) {
    kVal = k;
    doFindKthLargestValueInBst(tree);
    return val;
  }

  public static void doFindKthLargestValueInBst(BST tree) {
    if (tree == null) {
      return;
    }

    doFindKthLargestValueInBst(tree.right);
    kVal--;
    if(kVal == 0) {
      val = tree.value;
      return;
    }
    doFindKthLargestValueInBst(tree.left);
  }

}
