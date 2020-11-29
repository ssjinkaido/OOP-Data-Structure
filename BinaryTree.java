class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value=value;
        right = null;
        left = null;
    }
}
public class BinaryTree {
    Node root;
    Node temp;
    BinaryTree()
    {
        root = null;
    }
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
    public Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);

        }else if(value>current.value){
            current.right = deleteRecursive(current.right, value);
        }else if (value == current.value) {
            if (current.left == null && current.right == null) {
                current=null;
            }else
            if (current.right == null) {
                current=current.left;
            }else
            if (current.left == null) {
                current=current.right;
            }else{
                int smallestValue=findSmallestValue(current.right);
                current.value = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
                return current;
            }
        }
        return current;
    }
    public int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.add(10);
        bt.add(4);
        bt.add(20);
        bt.add(7);
        bt.add(9);
        bt.add(11);
        bt.add(5);
        System.out.println("Traverse in inorder");
        bt.traverseInOrder(bt.root);
        System.out.println("\nTraverse in postorder");
        bt.traversePostOrder(bt.root);
        System.out.println("\nTraverse in preorder");
        bt.traversePreOrder(bt.root);
        bt.deleteRecursive(bt.root,7);
        System.out.println("\nTraverse in inorder");
        bt.traverseInOrder(bt.root);
        System.out.println("\nTraverse in postorder");
        bt.traversePostOrder(bt.root);
        System.out.println("\nTraverse in preorder");
        bt.traversePreOrder(bt.root);
    }
}
