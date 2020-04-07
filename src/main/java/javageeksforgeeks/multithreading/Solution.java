package javageeksforgeeks.multithreading;

class Solution {
    int d;
    int sum;

    public int deepestLeavesSum(TreeNode root) {
        d = Integer.MIN_VALUE;
        sum = 0;
        find(root, 0);
        return sum;
    }

    public void find(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (d == Integer.MIN_VALUE) {
                d = level;
                sum += root.val;
            } else if (level > d) {
                d = level;
                sum = 0;
                sum += root.val;
            } else if (level == d) {
                sum += root.val;
            }
            return;
        }
        find(root.left, level + 1);
        find(root.right, level + 1);
        return;
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