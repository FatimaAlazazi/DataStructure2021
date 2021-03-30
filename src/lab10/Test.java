package lab10;

/**
 * Created by fatima on 26/03/2021.
 */
public class Test {
    public static void main(String[] args) {
        Tree<String>tree= new Tree<>();
      Position<String>p =tree.addRoot("root");

    tree.addLeft(p,"left child");
        tree.addRight(p,"right child");
//        System.out.println(tree.root().getElement());
//        System.out.println(tree.size());
//        tree.remove(p);
//        System.out.println(tree.root().getElement());
//        System.out.println(tree.size());
        tree.printInOrder(p);


    }
}
