public class BinaryTree<T> {
    // The root of the tree
    private BinaryTreeNode<T> root;
    /**
     * Constructs the tree.
     * @param value - the value of the node.
     * @param leftChild - the left children of the node.
     * @param rightChild - the right children of the node.
     */
    public BinaryTree(T value, BinaryTree<T> leftChild,
                      BinaryTree<T> rightChild) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        BinaryTreeNode<T> leftChildNode =
                leftChild != null ? leftChild.root : null;
        BinaryTreeNode<T> rightChildNode =
                rightChild != null ? rightChild.root : null;
        this.root = new BinaryTreeNode<T>(
                value, leftChildNode, rightChildNode);
    }
    /**
     * Constructs the tree.
     * @param value - the value of the node.
     */
    public BinaryTree(T value) {
        this(value, null, null);
    }
    /**
     * @return the root of the tree.
     */
    public BinaryTreeNode<T> getRoot()
    {
        return this.root;
    }
/**
 * @return the left child of the root.
}
 */
public BinaryTreeNode<T> getLeftChildNode()
{
    if (this.root != null)
    {
        return this.root.getLeftChild();
    }
    return null;
}
    /**
     * @return the right child of the root.
     */
    public BinaryTreeNode<T> getRightChildNode()
    {
        if (this.root != null)
        {
            return this.root.getRightChild();
        }
        return null;
    }
    /**
     * Traverses binary tree in pre-order manner.
     * @param root - the binary tree to be traversed.
     */
    private void printPreOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
//1. Visit the root of this subtree.
        System.out.print(root.getValue() + " ");
// 2. Visit the left child.
        printPreOrder(root.getLeftChild());
// 3. Visit the right child.
        printPreOrder(root.getRightChild());
    }
    /**
     * Traverses binary tree in pre-order manner.
     * @param root - the binary tree to be traversed.
     */
    private void printInOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
// 1. Visit the left child.
        printPreOrder(root.getLeftChild());
// 2. Visit the root of this subtree.
        System.out.print(root.getValue() + " ");
// 3. Visit the right child.
        printPreOrder(root.getRightChild());
    }
    /**
     * Traverses binary tree in pre-order manner.
     * @param root - the binary tree to be traversed.
     */
    private void printPostOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
// 1. Visit the left child.
        printPreOrder(root.getLeftChild());
// 2. Visit the right child.
        printPreOrder(root.getRightChild());
// 3. Visit the root of this subtree.
        System.out.print(root.getValue() + " ");
    }
    /**
     * Traverses and prints the binary
     * tree in pre-order manner.
     */
    public void printPreOrder() {printPreOrder(this.root);
        System.out.println();
    }
    /**
     * Traverses and prints the binary
     * tree in in-order manner.
     */
    public void printInOrder() {printInOrder(this.root);
        System.out.println();
    }
    /**
     * Traverses and prints the binary
     * tree in post-order manner.
     */
    public void printPostOrder() {printPostOrder(this.root);
        System.out.println();
    }
}