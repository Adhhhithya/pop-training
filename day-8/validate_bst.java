import java.util.*;

class Node{
  int data;
  Node left, right, root;

  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
    this.root = null;
  }

  Node insert_bst(Node root, int d){
    if(root == null){
      return new Node(d);
    }
    if(d < root.data){
      root.left = insert_bst(root.left, d);
    } else if(d > root.data){
      root.right = insert_bst(root.right, d);
    }
    return root;
  }

  void insert_bt(int arr[]){
    Queue<Node> q = new LinkedList<>();
    root = new Node(arr[0]);
    q.add(root);

    int i = 1;
    while(!q.isEmpty() && i < arr.length){
      Node curr = q.poll();

      if(i < arr.length){
        curr.left = new Node(arr[i]);
        q.add(curr.left);
        i++;
      }
      if(i < arr.length){
        curr.right = new Node(arr[i]);
        q.add(curr.right);
        i++;
      }
    }
  }

  void inorder(Node root, ArrayList<Integer> list){
    if(root == null) return;
    inorder(root.left, list);
    list.add(root.data);
    inorder(root.right, list);
  }
}

public class validate_bst {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    Node bt = new Node(-1);
    Node bst = new Node(-1);

    // build BT
    bt.insert_bt(arr);

    // build BST
    for(int x : arr){
      bst.root = bst.insert_bst(bst.root, x);
    }

    ArrayList<Integer> inorderBT = new ArrayList<>();
    ArrayList<Integer> inorderBST = new ArrayList<>();

    bt.inorder(bt.root, inorderBT);
    bst.inorder(bst.root, inorderBST);

    if(inorderBT.equals(inorderBST)){
      System.out.println("The book collection is a valid binary search tree.");
    }else{
      System.out.println("The book collection is NOT a valid binary search tree.");
    }
  }
}