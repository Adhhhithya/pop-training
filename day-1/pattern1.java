import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                int temp = num+i;
                num = temp;
                for(int j=0;j<i;j++){
                    if(i-1==j){
                        System.out.print((temp--)+" ");
                    }else{
                        System.out.print((temp--)+"*");
                    }
                }
                System.out.println();
            }
            else{
                for(int j=0;j<i;j++){
                    num=num+1;
                    if(i-1==j){
                        System.out.print((num)+" ");
                    }else{
                        System.out.print((num)+"*");
                    }
                }
                System.out.println();
            }
        }
    }
}
