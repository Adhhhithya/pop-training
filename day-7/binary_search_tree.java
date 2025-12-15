import java.util.*;
class Node{
    int data;
    Node left , right , root;
    Node(int data){
        this.data=data;
        this.left = null;
        this.right = null;
        this.root = null;
    }

    static Node insert(Node root, int d){
        if(root==null){
            return new Node(d);
        }
        if(d<root.data){
            root.left = insert(root.left , d);
        }else if(root.data<d){
            root.right = insert(root.right ,d);
        }
        return root;
    }

    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
public class binary_search_tree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.println("Enter node values: ");
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            root = Node.insert(root , d);
        }
        root.inorder(root);
    }
}
