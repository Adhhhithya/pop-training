import java.util.*;
class Node{
    int data;
    Node left,right,root;
    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
        this.root=null;
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

     void insert(int arr[]){
        Queue<Node> q = new LinkedList<>();
        this.root = new Node(arr[0]);
        q.add(this.root);
        int i=1;
        while(!q.isEmpty() && i<arr.length){
            Node curr = q.poll();
            if(arr[i]!=-1){
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;
            if(i<arr.length && arr[i]!=-1){
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
    }

    void display(){
        Queue<Node> q = new LinkedList<>();
        System.out.print(root.data+" ");
        q.add(this.root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left!=null){
                System.out.print(curr.left.data+" ");
                q.add(curr.left);
            } 
            if(curr.right!=null){
                System.out.print(curr.right.data+" ");
                q.add(curr.right);
            } 
        }
    }
}
public class binary_tree_implementation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Node obj = new Node(-1);
            System.out.print("Enter number of nodes: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter node values (-1 for null): ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            obj.insert(arr);
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
}
