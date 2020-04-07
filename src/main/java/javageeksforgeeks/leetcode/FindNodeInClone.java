package javageeksforgeeks.leetcode;

public class FindNodeInClone {

    public static void main(String[] args) {
        TreeNode root1= new TreeNode(7);
        TreeNode left1= new TreeNode(4);
        TreeNode right1= new TreeNode(3);
        root1.left=left1;
        root1.right = right1;

        TreeNode left2= new TreeNode(6);
        TreeNode right2= new TreeNode(19);
        right1.left=left1;
        right1.right = right1;


        TreeNode root2= new TreeNode(7);
        TreeNode left21= new TreeNode(4);
        TreeNode right21= new TreeNode(3);
        root2.left=left21;
        root2.right = right21;

        TreeNode left22= new TreeNode(6);
        TreeNode right22= new TreeNode(19);
        right21.left=left21;
        right21.right = right21;

        TreeNode target = new TreeNode(3);

        System.out.println(getTargetCopy(root1,root2,target).val);

    }

    public static final TreeNode getTargetCopy(final TreeNode original,
                                               final TreeNode cloned, final TreeNode target) {
        if(original==null || cloned ==null) {
            return null;
        }
        if(original.val == target.val && cloned.val==target.val) {
            return cloned;
        }

        TreeNode nodeLeft = getTargetCopy(original.left,cloned.left,target);
        if(nodeLeft !=null){
            return nodeLeft;
        }
        TreeNode nodeRight = getTargetCopy(original.right,cloned.right,target);
        if(nodeRight !=null){
            return nodeRight;
        }
        return null;
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}

