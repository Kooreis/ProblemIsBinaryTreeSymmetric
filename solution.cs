public class Program
{
    public static void Main()
    {
        Node tree = new Node(1, 
            new Node(2, new Node(3), new Node(4)), 
            new Node(2, new Node(4), new Node(3)));

        Console.WriteLine(IsSymmetric(tree));
    }
}