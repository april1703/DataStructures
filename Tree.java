class Tree
{
    public static void main(String [] args)
    {
        // create a simple tree
        TreeNode root = new TreeNode(8);
        root.setLeft(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(1));
        
        root.setRight(new TreeNode(10));
        root.getRight().setLeft(new TreeNode(9));

        // add a 12 to the right of 10
        root.getRight().setRight(new TreeNode(12));

        // In order traversal of the tree starting at the root
        System.out.print("In Order:\t");
        InOrderPrint(root);

        System.out.print("\nPreOrder:\t");
        PreOrderPrint(root);

        System.out.print("\nPreOrder:\t");
        PostOrderPrint(root);

    }

    public static TreeNode insert(int x, TreeNode root)
    {
        // create three TreeNode objects
        TreeNode current, trail, newnode;
        current = trail = newnode = null;

        // create the node that will be attached to the tree
        newnode = new TreeNode(x);

        if (root == null)
            root = newnode;
        else
        {
            current = root;
            
            while (current != null)
            {
                trail = current; 

                // check which direction to go
                if (current.getData() == x)
                {
                    System.out.println("No duplicate values");
                    return root;
                }
                else if (current.getData() > x)
                {
                    current = current.getLeft();
                }
                else
                {
                    current = current.getRight();
                }
            }
            
            if (trail.getData() > x)
                trail.setLeft(newnode);
            else
                trail.setRight(newnode);
            return root;
        }
    }

    public static void InOrderPrint(TreeNode a)
    {
        if (a == null)
            return;
        else
        {
            InOrderPrint(a.getLeft());
            System.out.print(a + ", ");
            InOrderPrint(a.getRight());
        }
    }

    public static void PreOrderPrint(TreeNode a)
    {
        if (a == null)
            return;
        else
        {
            System.out.print(a + ", ");
            PreOrderPrint(a.getLeft());
            PreOrderPrint(a.getRight());
        }
    }

    public static void PostOrderPrint(TreeNode a)
    {
        if (a == null)
            return;
        else
        {
            PostOrderPrint(a.getLeft());
            PostOrderPrint(a.getRight());
            System.out.print(a + ", ");
        }
    }
}