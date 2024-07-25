import java.util.*;
public class UnionOfArrays{
    //Time Compleixty : O( (m+n)log(m+n) )
    public static void main(String []args){
        int n=5,m=5;
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b={2,3,4,4,5,11,12};
        int[] c=unionOfArrays(a,b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
    public static int[] unionOfArrays(int[] a,int[] b){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        int c[]=new int[hs.size()];
        Iterator<Integer> i =hs.iterator();
        int j=0;
        while(i.hasNext()){
            c[j]=i.next();
            j++;
        }
        return c;
    }
}