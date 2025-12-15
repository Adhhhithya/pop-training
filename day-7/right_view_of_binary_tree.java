import java.util.*;
class Node{
  String data;
  Node left,right,root;
  Node(String data){
    this.data=data;
    this.left=null;
    this.right = null;
    this.root = null;
  }

  void insert(String arr[]){
    Queue<Node> q = new LinkedList<>();
    root = new Node(arr[0]);
    q.add(root);

    int i=1;
    while(!q.isEmpty() && i<arr.length){
      Node curr = q.poll();
      if(i<arr.length && !(arr[i].equals("null"))){
        curr.left = new Node(arr[i]);
        q.add(curr.left);
      }
      i++;
      if(i<arr.length && !(arr[i].equals("null"))){
        curr.right = new Node(arr[i]);
        q.add(curr.right);
      }
      i++;
    }
  }
  static int maxL=0;
  void right_view(Node root, int level){
    if(root==null) return;
    if(maxL < level){
      maxL=level;
      System.out.print(root.data+" ");
    }
    right_view(root.right,level+1);
    right_view(root.left,level+1);
  }
}
public class right_view_of_binary_tree {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();   
    sc.nextLine();
    System.out.println("Enter node values in level order (use 'null' for no node): ");
    String arr[] = sc.nextLine().split(" ");
    Node obj = new Node("null");
    obj.insert(arr);
    obj.right_view(obj.root, 1);
    
  }
}