package trees;

public class TreeMain {
    public static void main(String[] args){
        treeClassSample();
    }

    public static void treeClassSample(){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
        System.out.println("Complete");
        System.out.println(tree.find(4));
        tree.traversePreOrder();
    }
}
