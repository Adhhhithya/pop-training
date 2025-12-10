import java.util.*;
public class weather_forecast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[] = new int[n];
        int i=0,j=i+1,cnt=0;
        while(i<n){
            if(j==n){
                res[i]=0;
                i++;
                j=i+1;
                cnt=0;
                continue;
            }
            if(arr[j]>arr[i]){
                cnt++;
                res[i]=cnt;
                i++;
                j=i+1;
                cnt=0;
            }else{
                cnt++;
                j++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(res[k]+" ");
        }
        sc.close();

    }
    
}
