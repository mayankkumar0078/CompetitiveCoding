package javageeksforgeeks.tree;

import java.util.Stack;

public class InOrderTraversalWithoutRecursion {

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

        traverseInOrderIteratively(root);
    }



    public static void traverseInOrderIteratively(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currentNode = root;
        stack.push(root);
        while (true) {
            if(currentNode!= null &&currentNode.left!=null) {
                stack.push(currentNode.left);
                currentNode = currentNode.left;
            }else if(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                System.out.println(node.val);
                if(node.right!=null) {
                    stack.push(node.right);
                    currentNode = node.right;
                }

            } else {
                break;
            }
        }
    }

    private static class TreeNode {
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
}

