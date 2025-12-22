package algoexpert.bst;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BSTConstructionIterative {
    public static void main(String[] args) {
        BSTConstructionIterative.BST bst = new BSTConstructionIterative.BST(10);
       // bst.insert(10);
//        bst.insert(100);
//        bst.insert(50);
//        bst.insert(30);
//        bst.insert(5);
//        bst.insert(1);
//        bst.insert(3);
//        bst.insert(7);
//        bst.insert(6);
//        bst.insert(15);
//        bst.insert(19);
//        bst.insert(12);
        //bst.insert(10);
        bst.insert(5);
        System.out.println(bst.contains(12));
        bst.remove(10);
        System.out.println(bst.contains(15));
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
            BST current = this;
            while (true) {
                if (value < current.value) {
                    if(isNull(current.left)) {
                        current.left = new BST(value);
                        break;
                    } else {
                        current = current.left;
                    }

                } else {
                    if(isNull(current.right)) {
                        current.right = new BST(value);
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST current = this;
            while (!isNull(current)) {
                if (value < current.value) {
                    current = current.left;
                } else if(value > current.value){
                    current = current.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove(value,null);
            return this;
        }
        public BST remove(int value,BST parent) {
            BST current = this;


            while(nonNull(current)) {
                if(value < current.value) {
                    parent = current;
                    current = current.left;
                } else if (value > current.value) {
                    parent = current;
                    current = current.right;
                } else {
                    if(nonNull(current.left) && nonNull(current.right)) {
                        BST smallest = current.right.getSmallest();
                        current.value = smallest.value;
                        current.right.remove(smallest.value,current);
                    } else if(isNull(parent)){
                        if(nonNull(current.left)) {
                            current.value = current.left.value;
                            current.right = current.left.right;
                            current.left = current.left.left;
                        } else if (nonNull(current.right)){
                            current.value = current.right.value;
                            current.left = current.right.left;
                            current.right = current.right.right;
                        }
                    } else if (parent.left == current) {
                        if(nonNull(current.left)) {
                            parent.left = current.left;
                        } else if(nonNull(current.right)) {
                            parent.left =current.right;
                        } else {
                            parent.left = null;
                            current =null;
                        }
                    } else if(parent.right == current) {
                        if(nonNull(current.left)) {
                            parent.right = current.left;
                        } else if(nonNull(current.right)) {
                            parent.right =current.right;
                        } else {
                            parent.right = null;
                            current = null;
                        }
                    }
                }
            }
            return this;
        }

        public BST getSmallest() {
            BST current = this;
            BST parent = this;
            while(nonNull(current)) {
                parent =current;
                current = current.left;
            }
            return parent;
        }
    }
}
