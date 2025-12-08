import java.util.Scanner;

public class sum_numbers_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum=0;
        String res ="";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                res+=ch;
            }else if(!res.equals("")){
                sum+=Integer.parseInt(res);
                res="";
            }
        }
        if(!res.equals("")){
            sum+=Integer.parseInt(res);
            res="";
        }
        System.out.print(sum);
        sc.close();
    }
}
