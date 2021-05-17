package trees;

public class TreeMain {
    public static void main(String[] args){
//        treeClassSample();
//        treeEquality();
//        treeDistance();
//        breadthFirstSearch();
        countLeaves();
    }

    public static void countLeaves(){
        Tree tree = new Tree();
//        tree.insert(7);
//        tree.insert(4);
//        tree.insert(1);
//        tree.insert(6);
//        tree.insert(9);
//        tree.insert(8);
//        tree.insert(10);
//        tree.insert(0);
//        tree.insert(2);
//        tree.insert(5);
//        tree.insert(11);
        System.out.println(tree.countLeaves());
        System.out.println(tree.size());
    }

    public static void breadthFirstSearch(){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
        tree.traverseLevelOrder();
    }

    public static void treeDistance(){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
//        tree.printNodesAtDistance(0);
//        tree.printNodesAtDistance(1);

        System.out.println(tree.getNodesAtDistance(2));
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
        System.out.println(tree.find(4));
//        tree.traversePreOrder();
//        tree.traverseInOrder();
//        tree.traversePostOrder();
//        System.out.println(tree.height());
        System.out.println(tree.minimum());
    }

    public static void treeEquality(){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(9);
        tree2.insert(8);
        tree2.insert(1);

        System.out.println(tree.equals(tree2));
        System.out.println(tree.equals(null));
    }
}
