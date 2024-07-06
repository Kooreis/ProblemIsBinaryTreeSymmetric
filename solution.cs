Here is a simple console application in C# that determines if a binary tree is symmetric:

```C#
using System;

public class Node
{
    public int Value;
    public Node Left;
    public Node Right;

    public Node(int value, Node left = null, Node right = null)
    {
        Value = value;
        Left = left;
        Right = right;
    }
}

public class Program
{
    public static void Main()
    {
        Node tree = new Node(1, 
            new Node(2, new Node(3), new Node(4)), 
            new Node(2, new Node(4), new Node(3)));

        Console.WriteLine(IsSymmetric(tree));
    }

    public static bool IsSymmetric(Node root)
    {
        return root == null || IsSymmetric(root.Left, root.Right);
    }

    public static bool IsSymmetric(Node left, Node right)
    {
        if (left == null || right == null)
            return left == right;
        if (left.Value != right.Value)
            return false;

        return IsSymmetric(left.Left, right.Right) && IsSymmetric(left.Right, right.Left);
    }
}
```

This program creates a binary tree and checks if it is symmetric. The `IsSymmetric` method checks if the left and right subtrees of the root are mirror images of each other. If they are, it returns true; otherwise, it returns false. The `IsSymmetric` method is called recursively for the left and right subtrees of the root.