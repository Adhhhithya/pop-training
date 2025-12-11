import java.util.*;
public class binary_code_generation{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x=1;
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      if(i<n-1){
      System.out.print(Integer.toBinaryString(x)+", ");
      }
      else{
        System.out.print(Integer.toBinaryString(x));
      }
      x=x+1;
    }
    sc.close();
  }
}