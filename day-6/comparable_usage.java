import java.util.*;

class Sample implements Comparable<Sample>{
    int age;
    String name;
    public Sample(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Sample s){
        // return this.age - s.age; // ascending order
        // return s.age - this.age; // descending order
        return this.name.compareToIgnoreCase(s.name);
    }
    @Override
    public String toString(){
        return this.age +" "+this.name;
    }
}
public class comparable_usage {
    public static void main(String[] args){
        ArrayList<Sample> arr = new ArrayList<>();
        arr.add(new Sample(14,"Ajay"));
        arr.add(new Sample(12,"Vijay"));
        arr.add(new Sample(15,"Sanjay"));
        arr.add(new Sample(10,"Raj"));

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
    
}
