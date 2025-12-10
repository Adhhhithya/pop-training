import java.util.*;
public class  infix_to_postfix{

    public static int prec(String op) {
      switch(op){
        case "^":
          return 3;
        case "*":
        case "/":
          return 2;
        case "+":
        case "-":
          return 1;
      }
      return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        String arr[] = sc.nextLine().split(" ");
      String res ="";
      for(int i=0;i<arr.length;i++){
        if(Character.isLetter(arr[i].charAt(0))){
          res=res+" "+arr[i];
        }else if(arr[i].equals("(")){
          st.push("(");
        }else if(arr[i].equals(")")){
          String temp = st.pop();
          while(!temp.equals("(")){
            res= res+" "+temp;
            temp=st.pop();
          }
        }else{
          while(!st.empty() && prec(arr[i])<=prec(st.peek())){
            res=res+" "+st.pop();
          }
          st.push(arr[i]);
        }
      }
      while(!st.empty()){
        res= res+" "+st.pop();
      }
      System.out.println(res.trim());
      sc.close();

        
    }
}