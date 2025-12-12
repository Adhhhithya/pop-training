import java.util.*;
class Patient implements Comparable<Patient>{
  String name;
  int severity;
  public Patient(String name , int severity){
    this.name = name;
    this.severity=severity;
  }

  public int compareTo(Patient obj){
    return this.severity - obj.severity;
  }

  public String toString(){
    return name+" "+severity;
  }
}
public class emergency_triage{
  public static PriorityQueue<Patient> pq = new PriorityQueue<>(Collections.reverseOrder());

  public static void enqueue(String name, int severity){
    pq.add(new Patient(name,severity));
  }

  public static void dequeue(){
    if(pq.isEmpty()){
      System.out.println("Treated Patient: Queue is empty. No patient to treat.");
    }else{
      Patient p = pq.poll();
      System.out.println("Treated Patient: "+p.name+" "+p.severity);
    }
  }

  public static void display(){
    if(pq.isEmpty()){
      System.out.println("Queue is empty.");
    }else{
      System.out.print("Current Queue: ");
      for(Patient i:pq){
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      String command = sc.next().trim();
      if(command.equals("ENQUEUE")){
        String name = sc.next();
        int severity = sc.nextInt();
        enqueue(name,severity);
      }else if(command.equals("DEQUEUE")){
        dequeue();
      }else if(command.equals("DISPLAY")){
        display();
      }
    }
  }
}