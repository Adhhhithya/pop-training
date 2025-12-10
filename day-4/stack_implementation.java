import java.util.Scanner;
import java.util.Stack;

public class stack_implementation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String choice = sc.next();

            if(choice.equals("Push")){
                st.push(sc.nextInt());

            }else if(choice.equals("Pop")){
                if(st.empty()){
                    System.out.println("Stack Underflow");
                }else{
                    st.pop();
                }

            }else if(choice.equals("Top")){
                if(st.empty()){
                    System.out.println("Stack Underflow");
                }else{
                    System.out.println(st.peek());
                }

            }else if(choice.equals("IsEmpty")){
                System.out.println(st.empty());

            }else if(choice.equals("Size")){
                System.out.println(st.size());
            }
        }
        sc.close();
    }
}