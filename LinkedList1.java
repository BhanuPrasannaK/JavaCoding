import java.io.*;
import java.util.*;
class LinkedList1
{
    public static void main(String []args)
    {
        LinkedList<String> ll=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of values :");
        int n=sc.nextInt();
        System.out.println("enter values : ");
        for(int i=0; i<n;i++){
            ll.add(sc.next());
        }
        Iterator<String> i =ll.iterator();
        while(i.hasNext()){
            String s=i.next();
            if(s.length()<5)
                i.remove();
        }
        System.out.println(ll);
    }
}