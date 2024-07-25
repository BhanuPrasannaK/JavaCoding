import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet7{
    public static void main(String args[]){
        TreeSet<String> ts=new TreeSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of values :");
        int n=sc.nextInt();
        System.out.println("enter values : ");
        for(int i=0; i<n;i++){
            ts.add(sc.next());
        }
        Iterator<String> i =ts.iterator();
        System.out.println("Contents of the TreeSet:");
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
}