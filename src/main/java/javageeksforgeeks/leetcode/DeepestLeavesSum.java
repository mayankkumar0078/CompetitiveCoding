package javageeksforgeeks.leetcode;

public class DeepestLeavesSum {

    public static void main(String [] args) {
        TreeNode root= new TreeNode(1);
        TreeNode node1= new TreeNode(2);
        TreeNode node2= new TreeNode(3);
        root.setLeft(node1);
        root.setRight(node2);
        TreeNode node3= new TreeNode(4);
        TreeNode node4= new TreeNode(5);
        node1.setLeft(node3);
        node1.setRight(node4);
        TreeNode node5= new TreeNode(7);
        node3.setLeft(node5);

        TreeNode node6= new TreeNode(6);
        node2.setRight(node6);

        TreeNode node7= new TreeNode(8);
        node6.setRight(node7);
        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
        int height =deepestLeavesSum.findHeight(root);
        System.out.println();

        System.out.println(deepestLeavesSum.sum(root,height,1));
    }

    private int sum(TreeNode root, int height,int currentLevel) {
        if(root==null){
            return 0;
        }
        if(root !=null &&root.left==null && root.right==null && currentLevel==height){
            return root.val;
        }

        return sum(root.left,height,currentLevel+1) +sum(root.right,height,currentLevel+1);
    }

    private int findHeight(TreeNode root) {
        if(root==null){
            return 0;
        }

        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    TreeNode(int x) { val = x; }
}
