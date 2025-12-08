import java.util.Scanner;
public class unit_digit {
    public static void sum_of_digits(int n){
        int sum =0;
        while(n>9){
            sum=0;
            while(n!=0){
                sum += (n%10);
                n/=10;
            }
            n=sum;
        }
        System.out.println(sum);
    }

    public static void product_of_digits(int n){
        int prod =1;
        while(n>9){
            prod =1;
            while(n!=0){
                prod *= (n%10);
                n/=10;
            }
            n=prod;
        }
        System.out.println(prod);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
            sum_of_digits(n);
        }
        else{
            System.out.println("Odd");
            product_of_digits(n);
        }
        sc.close();
    }
}
