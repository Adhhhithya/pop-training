import java.util.Scanner;
public class largest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largestNum =0;
        for(int i=9;i>=0;i--){
            int temp = n;
            while(temp!=0){
                int last_digit = temp%10;
                if(last_digit==i){
                    largestNum=(largestNum*10)+i;
                }
                temp=temp/10;
            }
        }
        System.out.println(largestNum);
        sc.close();
    }
}
