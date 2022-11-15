package algoexpert.bst;

public class BSTConstruction {


    public static void main(String[] args) {
        BST bst = new BST(100);
        bst.insert(10);
        bst.insert(100);
        bst.insert(50);
        bst.insert(30);
        bst.insert(10);

        System.out.println(bst);
    }
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            doInsert(this,value);
            return this;
        }

        private void doInsert( BST node, int value) {
            if(value >= node.value) {
                if(node.right == null) {
                    BST temp = new BST(value);
                    node.right =temp;
                } else {
                    doInsert(node.right,value);
                }
            } else if(value < node.value) {

                if(node.left == null) {
                    BST temp = new BST(value);
                    node.left =temp;
                } else {
                    doInsert(node.left,value);
                }
            }
        }

        public boolean contains(int value) {
            // Write your code here.
            return false;
        }

        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            return this;
        }
    }
}
