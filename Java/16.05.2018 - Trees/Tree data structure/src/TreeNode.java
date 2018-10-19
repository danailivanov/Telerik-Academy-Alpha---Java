import java.util.ArrayList;

public class TreeNode<T> {
    // Contains the value of the node
    private T value;

    //Shows whether the current node has parent
    private boolean hasParent;

    //Contains the children of the node
    private ArrayList<TreeNode<T>> children;

    /**
     * Constructs a tree node.
     * @param value - the value of the node.
     */
    public TreeNode(T value) {
        if(value == null){
            throw new IllegalArgumentException("Cannot insert null value!");
        }
        this.value = value;
        this.children = new ArrayList<>();
    }

    public ArrayList<TreeNode<T>> getChildren() {
        return children;
    }

    /**
     * @return the value of the node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the value of the node.
     * @param value - the value to be set.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Adds child to the node.
     * @param child - the child to be added.
     */
    public void addChild(TreeNode<T> child) {
        if (child == null) {
            throw new IllegalArgumentException(
                    "Cannot insert null value!");
        }
        if (child.hasParent) {
            throw new IllegalArgumentException(
                    "The node already has a parent!");
        }
        child.hasParent = true;
        this.children.add(child);
    }
    /**
     * Gets the child of the node at given index.
     * @param index - the index of the desired child.
     * @return the child on the given position.
     */
    public TreeNode<T> getChild(int index) {
        return this.children.get(index);
    }

    /**
     * @return the number of node's children.
     */
    public int getChildrenCount() {
        return this.children.size();
    }
}
