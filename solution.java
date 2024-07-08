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
}