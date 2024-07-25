import java.util.*;
import java.io.*;
public class PriorityQueue8{
    public static void main(String args[]){
        PriorityQueue<String> pq=new PriorityQueue<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of values :");
        int n=sc.nextInt();
        System.out.println("enter values : ");
        for(int i=0; i<n;i++){
            pq.add(sc.next());
        }
        Iterator<String> i =pq.iterator();
        System.out.println("Content in the PriorityQueue");
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
        System.out.println("\nRemoving elements from the PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}