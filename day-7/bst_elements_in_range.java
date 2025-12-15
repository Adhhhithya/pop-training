import java.util.*;
class Node{
  int data;
  Node left,right,root;
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
    this.root=null;
  }

  Node insert(Node root ,int d){
    if(root==null){
      return new Node(d);
    }
    if(d<root.data){
      root.left=insert(root.left,d);
    }else if(root.data<d){
      root.right = insert(root.right,d);
    }
    return root;
  }

  void preorder(Node root, int start,int end){
    if(root==null) return;
    if(root.data>=start && root.data<=end){
      System.out.print(root.data+" ");
    }
    preorder(root.left,start,end);
    preorder(root.right,start,end);
  }
}
public class bst_elements_in_range {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node obj = new Node(-1);
    for(int i=0;i<n;i++){
      obj.root = obj.insert(obj.root,sc.nextInt());
    }
    int start = sc.nextInt();
    int end = sc.nextInt();

    obj.preorder(obj.root,start,end);
  }
}