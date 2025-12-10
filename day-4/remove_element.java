import java.util.Scanner;
import java.util.ArrayList;
public class remove_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();
        arr.remove(Integer.valueOf(k));
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}
