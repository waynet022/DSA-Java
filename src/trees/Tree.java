package trees;

import java.util.ArrayList;

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

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node node, int min, int max){
        if(node == null) return true;

        if(node.value < min || node.value > max) return false;

        return isBinarySearchTree(node.left, min, node.value-1)
        && isBinarySearchTree(node.right, root.value+1, max);

    }

    public ArrayList<Integer> getNodesAtDistance(int distance){
        ArrayList<Integer> list = new ArrayList<>();
        getNodesAtDistance(this.root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node node, int distance, ArrayList<Integer> list){
        if(node == null) return;
        if(distance == 0){
            list.add(node.value);
//            System.out.println(node.value);
            return;
        }
        getNodesAtDistance(node.left, distance-1, list);
        getNodesAtDistance(node.right, distance-1, list);
    }

    public void traverseLevelOrder(){
        for(int i=0; i<=height(); i++){
            for(var value: getNodesAtDistance(i))
                System.out.println(value);
        }
    }

    public int countLeaves(){
        if(this.root == null) return 0;
        return countLeaves(this.root, 0);
    }

    private int countLeaves(Node node, int leaves){
        if(node.left == null && node.right == null)
            return leaves+1;
        if(node.left != null && node.right != null)
            return countLeaves(node.left, leaves) + countLeaves(node.right, leaves);
        else if(node.left == null)
            return countLeaves(node.right, leaves);
        else
            return countLeaves(node.left, leaves);
    }

    public int size(){
        if(this.root == null) return 0;
        return size(this.root, 0);
    }

    private int size(Node node, int count){
        if(node.left == null && node.right == null)
            return count+1;
        if(node.left != null && node.right != null)
            return size(node.left, count) + 1 + size(node.right, count);
        if(node.right == null)
            return size(node.left, count) + 1;

        return size(node.right, count) +1;
    }
}