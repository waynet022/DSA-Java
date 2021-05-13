package trees;

public class TreeMain {
    public static void main(String[] args){
        treeClassSample();
    }

    public static void treeClassSample(){
        Tree tree = new Tree();
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(3);
        System.out.println("Complete");
        System.out.println(tree.find(4));
    }
}
