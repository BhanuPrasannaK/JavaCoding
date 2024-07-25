import java.util.*;
public class LSearch{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key to search : ");
        int key=sc.nextInt();
        int i=lsearch(a,key);
        System.out.println(i);
    }
    public static int lsearch(int[]a , int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key) return i;
        }
        return -1;
    }
}