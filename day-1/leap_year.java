import java.util.Scanner;

public class leap_year {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        if((y<1600 || y>2099) ||(m<1 || m>12) ){
            System.out.println("Invalid Input");
            return ;
        }
        if((y%400==0) || (y%100 !=0)&&(y%4==0)){
            if(m==2) System.out.println(29);
            return;
        }
        if(m==1||m==3||m==5|m==7||m==8||m==10||m==12){
            System.out.println(31);
        }else if(m==2){
            System.out.println(28);
        }else{
            System.out.println(30);
        }
        
    }
}
