import java.util.Scanner;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap4{
    public static void main(String []args){
        HashMap<String,Integer> hs=new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of pairs consists :");
        int n=sc.nextInt();
        System.out.println("enter key,values pairs : ");
    for(int i=0;i<n;i++){
        String name=sc.next();
        int marks=sc.nextInt();
        hs.put(name,marks);
    }
    Set<Map.Entry<String,Integer>> entry = hs.entrySet();
    Iterator<Map.Entry<String,Integer>> i= entry.iterator();
    System.out.println("StudentName\tMarks");
    while(i.hasNext()) {
        Map.Entry<String,Integer> e=i.next();
        System.out.println(e.getKey()+"\t\t"+e.getValue());
    }
    }
}