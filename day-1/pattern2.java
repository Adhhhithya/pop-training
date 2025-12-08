import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =97;
        int d1 = (2*n)-1;
        int d2 = 1;
        for(int i=0;i<n;i++){
            int temp = num;
            for(int j=0;j<n;j++){
                if(j%2==0){
                    System.out.print((char)temp +" ");
                    temp = temp+d1;
                }else{
                    System.out.print((char)temp +" ");
                    temp = temp+d2;
                }
            }
            System.out.println();
            d1 = d1-2;
            d2=d2+2;
            num = num+1;
        }
        sc.close();
    }
}
