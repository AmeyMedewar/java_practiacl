class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }
    public void insert(int val) {
        root = insert1(root, val);
    }
    private TreeNode insert1(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert1(root.left, val);
        } else if (val > root.val) {
            root.right = insert1(root.right, val);
        }

        return root;
    }
    
   public void postorderTraversal(TreeNode root) {
      if (root != null) {
           postorderTraversal(root.left);
          
          postorderTraversal(root.right);
          System.out.print(root.val + " ");
      
      }
      }
      
      
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        System.out.println("added nodes succesfully");
        
        System.out.println("Inorder traversal");
        tree.postorderTraversal(tree.root);
    }
}

