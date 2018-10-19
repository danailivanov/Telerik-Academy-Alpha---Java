import java.util.ArrayList;

public class Tree<T> {
    // The root of the tree

    private TreeNode<T> root;

    /**
     * Constructs the tree.
     * @param value - the value of the node.
     */
    public Tree(T value){
        if(value == null){
            throw new IllegalArgumentException("Cannot insert null value!");
        }
        this.root = new TreeNode<>(value);
    }

    /**
     *  Constructs the tree.
     * @param value - the value of the root node.
     * @param children - the children of the root node.
     */
    public Tree(T value, Tree<T> ...children){
        this(value);
        for (Tree<T> child :children) {
            this.root.addChild(child.root);
        }
    }

    /**
     * @return the root node or null if the tree is empty.
     */
    public TreeNode<T> getRoot()
    {
        return this.root;
    }
    /**
     * @return the child nodes of the tree.
     */
    public ArrayList<TreeNode<T>> getChildNodes()
    {
        if (this.root != null)
        {
            return this.root.getChildren();
        }
        return new ArrayList<TreeNode<T>>();
    }
    /**
     * Traverses and prints tree in
     * Depth First Search (DFS) manner.
     * @param root - the root of the tree
     * to be traversed.
     * @param spaces - the spaces used for
     * representation of the parent-child relation.
     */
    private void printDFS(TreeNode<T> root, String spaces){
        if(this.root == null){
            return;
        }
        System.out.println(spaces + root.getValue());
        TreeNode<T> child = null;
        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            printDFS(child, spaces + "  ");
        }
    }

    /**
     * Traverses and prints the tree in
     * Depth First Search (DFS) manner.
     */
    public void printDFS() {
        this.printDFS(this.root, new String());
    }
}
