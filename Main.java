import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;

    }
}

public class Main {

    TreeNode root;

    Main() {
        root = null;
    }

    // insertion

    void insert(int data) {

        root = insertRec(root, data);

    }

    private TreeNode insertRec(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (root.data > data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // deletion

    // view

    void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderRec(root.left);
        System.out.print(root.data + " --> ");
        inOrderRec(root.right);

    }

    // public void BFS(Node root) {

    List<Integer> list = new ArrayList<Integer>();if(root==null)
    {
        return list;
    }
    Queue<Node> q = new LinkedList<Node>();

    q.add(root);

    while(!q.isEmpty())
    {
        int level = q.size();

        for (int i = 0; i < level; i++) {
            int root = q.poll();
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }return list;
    }

    //

    public static void main(String[] args) {
        Main tree = new Main();

        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.inOrder();
        List<List<

    }

}
