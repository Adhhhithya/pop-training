import java.util.Scanner;
public class reverse_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0 , temp = n;
        while(temp!=0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }
        System.out.print(rev);
        sc.close();
        
    }
}
