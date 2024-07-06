Here is a Java console application that determines if a binary tree is symmetric:

```java
import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int item) {
        value = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    boolean isSymmetric(Node node) {
        return isMirror(node, node);
    }

    boolean isMirror(Node node1, Node node2) {
        if (node1 == null && node2 == null)
            return true;

        if (node1 != null && node2 != null && node1.value == node2.value)
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));

        return false;
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root value:");
        tree.root = new Node(scanner.nextInt());
        System.out.println("Enter left child value:");
        tree.root.left = new Node(scanner.nextInt());
        System.out.println("Enter right child value:");
        tree.root.right = new Node(scanner.nextInt());
        System.out.println("Enter left-left child value:");
        tree.root.left.left = new Node(scanner.nextInt());
        System.out.println("Enter right-right child value:");
        tree.root.right.right = new Node(scanner.nextInt());

        if (tree.isSymmetric(tree.root))
            System.out.println("The binary tree is symmetric");
        else
            System.out.println("The binary tree is not symmetric");
    }
}
```

This console application first creates a binary tree and then checks if it is symmetric. The user is prompted to enter the values for the root, left child, right child, left-left child, and right-right child. The application then checks if the binary tree is symmetric and prints the result.