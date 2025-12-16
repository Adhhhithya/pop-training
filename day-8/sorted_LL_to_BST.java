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

  // Node insert_bst(Node root,int d){
  //   if(root==null){
  //     return new Node(d);
  //   }
  //   if(d < root.data){
  //     root.left = insert_bst(root.left,d);
  //   }else if(root.data < d){
  //     root.right = insert_bst(root.right,d);
  //   }
  //   return root;
  // }

  void pre_order(Node root){
    if(root==null) return;
    System.out.print(root.data+" ");
    pre_order(root.left);
    pre_order(root.right);
  }
}

public class sorted_LL_to_BST {
  static Node LL_to_BST(int arr[],int l,int h){
    if(l>h){
      return null;
    }
    int mid =(l+h+1)/2;

    Node root = new Node(arr[mid]);
    root.left = LL_to_BST(arr,l,mid-1);
    root.right = LL_to_BST(arr,mid+1,h);
    return root;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node obj = new Node(-1);
    Node root = LL_to_BST(arr,0,n-1);
    obj.pre_order(root);
    
    
  }
}