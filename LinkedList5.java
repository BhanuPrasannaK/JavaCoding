import java.io.*;
import java.util.*;
class LinkedList5
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
        Collections.sort(ll);
        System.out.println("After sorting the list is ");
        for(String s:ll){
            System.out.print(s+" ");
        }
        int k=Collections.binarySearch(ll,"red");
        if(k<0){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found at "+k+1 + "position");
        }
    }
}