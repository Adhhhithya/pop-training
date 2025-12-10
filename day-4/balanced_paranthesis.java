import java.util.Scanner;
import java.util.Stack;

public class balanced_paranthesis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean is_balanced = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else{
                if(st.empty()){
                    is_balanced=false;
                    break;
                }
                char top = st.pop();
                if((ch==')'&& top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){
                    continue;
                }else{
                    is_balanced = false;
                    break;
                }
            }
        }
        System.out.println(is_balanced && st.empty());
        sc.close();
    }
}