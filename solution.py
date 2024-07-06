Here is a Python console application that determines if a binary tree is symmetric:

```python
class Node:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

def is_symmetric(root):
    return is_mirror(root, root)

def is_mirror(node1, node2):
    if node1 is None and node2 is None:
        return True
    if node1 is None or node2 is None:
        return False
    return (node1.val == node2.val) and is_mirror(node1.right, node2.left) and is_mirror(node1.left, node2.right)

def main():
    root = Node(1)
    root.left = Node(2)
    root.right = Node(2)
    root.left.left = Node(3)
    root.left.right = Node(4)
    root.right.left = Node(4)
    root.right.right = Node(3)
    print(is_symmetric(root))

if __name__ == "__main__":
    main()
```

In this application, we first define a Node class for the binary tree. Then we define a function `is_symmetric` that checks if the tree is symmetric by comparing the left and right subtrees. The function `is_mirror` checks if two trees are mirror images of each other. The `main` function creates a symmetric binary tree and checks if it is symmetric.