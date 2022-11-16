package algoexpert.bst;

public class BSTConstruction {


    public static void main(String[] args) {
        BST bst = new BST(100);
        bst.insert(10);
        bst.insert(100);
        bst.insert(50);
        bst.insert(30);
        bst.insert(5);
        bst.insert(1);
        bst.insert(3);
        bst.insert(7);
        bst.insert(6);
        bst.insert(15);
        bst.insert(19);
        bst.insert(12);
        //bst.insert(10);
        System.out.println(bst.contains(500));
        bst.remove(10);
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
           return doContains(this,value);
        }

        private boolean doContains(BST bst,int value) {
            if(bst.value == value) {
                return true;
            }
            if(value < bst.value) {
                if(bst.left !=null) {
                    return doContains(bst.left,value);
                } else {
                    return false;
                }

            }

            if(value > bst.value) {
                if(bst.right !=null) {
                    return doContains(bst.right,value);
                } else {
                    return false;
                }

            }
            return false;
        }

        public BST remove(int value) {
            RemoveData removeData = find(this,value,null,true);

            if(removeData != null) {
                if(removeData.current.left == null && removeData.current.right == null) {
                    if(removeData.isLeft) {
                        removeData.parent.left =null;
                    } else {
                        removeData.parent.right =null;
                    }

                } else if(removeData.current.left!= null) {
                    RemoveData nodes= findHighest(removeData.current.left,removeData.current,true);
                    if(nodes.isLeft) {
                        nodes.parent.left =null;
                    } else {
                        nodes.parent.right =null;
                    }

                    if(removeData.isLeft) {
                        removeData.parent.left = nodes.current;
                    } else {
                        removeData.parent.right = nodes.current;
                    }
                    nodes.current.left = removeData.current.left;
                    nodes.current.right = removeData.current.right;
                } else {
                    RemoveData nodes= findLowest(removeData.current.right,removeData.current,false);
                    if(nodes.isLeft) {
                        nodes.parent.left =null;
                    } else {
                        nodes.parent.right =null;
                    }
                    if(removeData.isLeft) {
                        removeData.parent.left = nodes.current;
                    } else {
                        removeData.parent.right = nodes.current;
                    }
                    nodes.current.left = removeData.current.left;
                    nodes.current.right = removeData.current.right;
                }
            }
            return this;
        }

        private RemoveData findHighest(BST left,BST parent, Boolean isLeft) {
            if(left.right == null) {
                RemoveData nodes = new RemoveData();
                nodes.current= left;
                nodes.parent = parent;
                nodes.isLeft = isLeft;
                return nodes;
            } else {
                return findHighest(left.right,left,false);
            }

        }

        private RemoveData findLowest(BST right,BST parent, Boolean isLeft) {
            if(right.left == null) {
                RemoveData nodes = new RemoveData();
                nodes.current= right;
                nodes.parent = parent;
                nodes.isLeft = isLeft;
                return nodes;
            } else {
                return findHighest(right.left,right,true);
            }

        }
        private RemoveData find(BST bst, int value,BST parent , Boolean isLeft) {
            if(bst.value == value) {
                RemoveData removeData = new RemoveData();
                removeData.parent =parent;
                removeData.current = bst;
                removeData.isLeft = isLeft;
                return removeData;
            }

            if(value < bst.value) {
                if(bst.left !=null) {
                    return find(bst.left,value,bst,true);
                } else {
                    return null;
                }

            }

            if(value > bst.value) {
                if(bst.right !=null) {
                    return find(bst.right,value,bst,false);
                } else {
                    return null;
                }

            }
            return null;
        }
    }

    static class RemoveData {
        BST parent;
        BST current;
        Boolean isLeft;
    }
}
