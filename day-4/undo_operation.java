import java.util.Scanner;
import java.util.Stack;
public class undo_operation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            st.push(ch);
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
