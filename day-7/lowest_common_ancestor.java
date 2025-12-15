import java.util.*;
class Node{
  String data;
  Node left , right , root;
  Node(String data){
    this.data=data;
    this.left = null;
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
      if(i<arr.length && (!arr[i].equals("null")) ){
        curr.left = new Node(arr[i]);
        q.add(curr.left);
      }
      i++;
      if(i<arr.length && (!arr[i].equals("null")) ){
        curr.right = new Node(arr[i]);
        q.add(curr.right);
      }
      i++;
    }
  }

  static boolean search(Node root , int target , ArrayList<String> list){
    if(root==null) {
      return false;
    }
    list.add(root.data);

    if(Integer.parseInt(root.data)==target || search(root.left,target,list) || search(root.right,target,list)){
      return true;
    }
    list.remove(list.size()-1);
    return false;
  }

  void lca(int a , int b){
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();

    if(search(root,a,list1)==false ||search(root,b,list2)==false){
      return;
    }
    int i=0;
    while(i<list1.size() && i<list2.size()){
      if(!list1.get(i).equals(list2.get(i))){
        break;
      }
      i++;
    }
    System.out.print(list1.get(i-1));
  }
}
public class lowest_common_ancestor{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String arr[] = sc.nextLine().split(" ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    Node obj = new Node("-1");
    obj.insert(arr);
    obj.lca(a,b);
    
  }
}