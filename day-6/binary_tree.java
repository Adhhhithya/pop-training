class Node{
    int data;
    Node left , right , root;
    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }

    void inorder(Node root){
        if (root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void preorder(Node root){
        if(root ==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
public class binary_tree {
    public static void main(String[] args) {
        Node obj = new Node(-1);
        obj.root = new Node(14);
        obj.root.left = new Node(16);
        obj.root.right = new Node(2);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.right = new Node(19);
        obj.root.left.right.left = new Node(17);

        System.out.print("Inorder Traversal: ");
        obj.inorder(obj.root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        obj.preorder(obj.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        obj.postorder(obj.root);

    }
}
