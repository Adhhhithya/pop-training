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
  static int maxL = 0;
  void depth(Node root, int level){
    if(root==null) return ;
    if(maxL<level){
      maxL = level;
    }
    depth(root.left,level+1);
    depth(root.right,level+1);
  }
}
public class depth_of_binary_tree {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter node values (use 'null' for missing nodes): ");
    String arr[] = sc.nextLine().split(" ");
    Node obj = new Node("null");
    obj.insert(arr);
    obj.depth(obj.root,1);
    System.out.print("Depth of the binary tree: " + obj.maxL);
    sc.close();
  }
}
