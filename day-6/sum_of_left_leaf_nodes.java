import java.util.*;
class Node{
  String data;
  Node left;
  Node right ;
  Node root;

  Node(String data){
    this.data = data;
    this.left=null;
    this.right = null;
    this.root = null;
  }

  void insert(String arr[]){
    if (arr.length == 0) {
      this.root = null;
      return;
    }
    if (arr[0].equals("null")) {  
      this.root = null;
      return;
    }

    this.root = new Node(arr[0]);
    Queue<Node> q = new LinkedList<>();
    q.add(this.root);

    int i = 1;
    while (!q.isEmpty() && i < arr.length) {
      Node curr = q.poll();

      if (i < arr.length && !arr[i].equals("null")) {
        curr.left = new Node(arr[i]);
        q.add(curr.left);
      }
      i++;

      if (i < arr.length && !arr[i].equals("null")) {
        curr.right = new Node(arr[i]);
        q.add(curr.right);
      }
      i++;
    }
  }
  static int sum = 0;
  void leftleaf(Node root){
    if(root==null) return ;
    if(root.left!=null && (root.left.left==null && root.left.right==null)){
      sum += Integer.parseInt(root.left.data);
    }
    leftleaf(root.left);
    leftleaf(root.right);
  }
}
public class sum_of_left_leaf_nodes {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the nodes in level order (use 'null' for no node): ");
    String arr[] = sc.nextLine().split(" ");
    Node obj = new Node("null");
    obj.insert(arr);
    obj.leftleaf(obj.root);
    System.out.print("Sum of left leaf nodes: " + obj.sum);
    sc.close();
  }
}