import java.util.*;
public class priority_queue_usage {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> q = new PriorityQueue<>();
    q.offer(10);
    q.offer(4);
    q.offer(12);

    ArrayList<Integer> arr = new ArrayList<>(q);
    System.out.println(arr);

    PriorityQueue<Integer> pq1 = new PriorityQueue<>();//min heap
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());//max heap
    
    System.out.println("Enter 5 elements for Min Heap and Max Heap:");
    for(int i=0;i<5;i++){
        pq1.offer(sc.nextInt());
        pq2.offer(sc.nextInt());
    }
    
    System.out.println("Min Heap:");
    while(!pq1.isEmpty()){
        System.out.print(pq1.poll()+" ");
    }
    System.out.println("\nMax Heap:");
    while(!pq2.isEmpty()){
        System.out.print(pq2.poll()+" ");
    }
}
}
