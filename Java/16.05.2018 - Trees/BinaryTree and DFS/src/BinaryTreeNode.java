public class BinaryTreeNode<T> {
    // Contains the value of the node
    private T value;
    // Shows whether the current node has parent
    private boolean hasParent;
    // Contains the left child of the node
    private BinaryTreeNode<T> leftChild;
    // Contains the right child of the node
    private BinaryTreeNode<T> rightChild;

    /**
     * Constructs a binary tree node.
     *
     * @param value      - the value of the node.
     * @param leftChild  - the left child of the node.
     * @param rightChild - the right child of the node.
     */
    public BinaryTreeNode(T value,
                          BinaryTreeNode<T> leftChild,
                          BinaryTreeNode<T> rightChild) {
        if (value == null) {
            throw new IllegalArgumentException(
                    "Cannot insert null value!");
        }
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Constructs a binary tree node with no children.
     *
     * @param value - the value of the node.
     */
    public BinaryTreeNode(T value) {
        this(value, null, null);
    }

    /**
     * @return the value of the node.
     */
    public T getValue() {
        return this.value;
    }

    /**
     * Sets the value of the node.
     *
     * @param value - the value to be set.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return the left child or null if it does not exists.
     */
    public BinaryTreeNode<T> getLeftChild() {
        return this.leftChild;
    }

    /**
     * Sets the left child.
     *
     * @param value - the new left child to be set.
     */
    public void setLeftChild(BinaryTreeNode<T> value) {
        if (value == null || value.hasParent) {
            throw new IllegalArgumentException();
        }
        value.hasParent = true;
        this.leftChild = value;
    }

    /**
     * @return the right child or null if it does not exists.
     */
    public BinaryTreeNode<T> getRightChild() {
        return this.rightChild;
    }

    /**
     * Sets the right child.
     *
     * @param value - the new right child to be set.
     */
    public void setRightChild(BinaryTreeNode<T> value) {
        if (value == null || value.hasParent) {
            throw new IllegalArgumentException();
        }
        value.hasParent = true;
        this.rightChild = value;
    }
}
