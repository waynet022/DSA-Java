package trees;

public class Tree {
    private class Node{
        private int value;
        private Node left;
        private Node right;
        private Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node = "+ this.value;
        }
    }

    private Node root;

    public Tree(){

    }

    public void insert(int value){
        Node node = new Node(value);
        if(this.root == null){
            this.root = node;
            return;
        }

        var current = this.root;

        while(true){
            if(current.value >= value){
                if(current.left == null){
                    current.left = node;
                    return;
                }
                else{
                    current = current.left;
                }
            }
            else{
                if(current.right == null){
                    current.right = node;
                    return;
                }
                else{
                    current = current.right;
                }
            }
        }

    }

    public boolean find(int value){
        var current = this.root;
        while(current!=null){
            if(current.value == value) return true;
            current = current.value > value ? current.left : current.right;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(this.root);
    }

    private void traversePreOrder(Node root){
        if(root == null) return;
        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder(){
        traverseInOrder(this.root);
    }

    private void traverseInOrder(Node root){
        if(root==null) return;
        traverseInOrder(root.left);
        System.out.println(root.value);
        traverseInOrder(root.right);
    }

    public void traversePostOrder(){
        traversePostOrder(this.root);
    }

    private void traversePostOrder(Node root){
        if(root==null) return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.println(root.value);
    }

    public int height(){
        return height(this.root);
    }

    private int height(Node node){
        if(node == null) return -1;
        if(isLeaf((node))) return 0;
        return 1 + Math.max(height(node.left),height(node.right));
    }

    public int minimum(){
        return minimum(this.root);
    }

    private int minimum(Node node){
        if(node == null) throw new IllegalStateException();
        if(isLeaf(node)) return node.value;
        return Math.min(Math.min(minimum(node.left), minimum(node.right)), node.value);
    }

    public boolean equals(Tree otherTree){
        if(otherTree == null) return false;
        return equals(this.root, otherTree.root);
    }

    private boolean equals(Node first, Node second){
        if(first == null && second == null) return true;
        if(first != null && second != null)
            return first.value == second.value
                    && equals(first.left, second.left)
                    && equals(first.right, second.right);
        return false;
    }

    private boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }

}
