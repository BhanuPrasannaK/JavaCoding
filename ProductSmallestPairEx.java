import java.util.*;
import java.io.*;
public class ProductSmallestPairEx{
    public static int productsmallestPair(int sum ,int a[]){
        if(a.length<2) return -1;
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }
        Collections.sort(al);
        Iterator<Integer> i=al.iterator();
        int x1=i.next();
        int x2=i.next();
        if(x1+x2 < sum){
            return x1*x2;
        }
        
        return 0;

    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int sum=sc.nextInt();
        int n= sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(productsmallestPair(sum,a));
    }
}