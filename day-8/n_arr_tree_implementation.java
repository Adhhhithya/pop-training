import java.util.*;

class Node{
    int data;
    List<Node> children;
    Node(int data){
        this.data=data;
        this.children = new ArrayList<Node>();
    }
}
public class n_arr_tree_implementation {
    static void level_order_traversal(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            for(Node child : curr.children){
                q.add(child);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter node values:");
        Node root = new Node(sc.nextInt());
        for(int i=1;i<n;i++){
            root.children.add(new Node(sc.nextInt()));
        }
        System.out.println(".()");
        level_order_traversal(root);
        sc.close();
    }
}
