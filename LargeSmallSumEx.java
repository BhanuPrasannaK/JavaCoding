import java.io.*;
import java .util.*;
public class LargeSmallSumEx{
    public static int largesmallSum(int []a){
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        even.add(a[0]);
        for(int i=1;i<a.length;i++){
            if(i%2==0) even.add(a[i]);
            else odd.add(a[i]);
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        return even.get (even.size () - 2) + odd.get (1);
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(largesmallSum(a));
    }
}