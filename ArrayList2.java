import java.io.*;
import java.util.*;
class ArrayList2
{
    public static void main(String []args)
    {
        ArrayList<String> al=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of values :");
        int n=sc.nextInt();
        System.out.println("enter values : ");
        for(int i=0; i<n;i++){
            al.add(sc.next());
        }
        System.out.println("Display using foreach");

        for(String s:al){
            System.out.print(s+" ");
        }
        ListIterator<String> i =al.listIterator();
        while(i.hasNext()){
            String s=i.next();
            if(s.compareTo("yellow")==0){
                i.set("purple");
            }
        }
        System.out.println();
        System.out.println("After modifing :");
        System.out.println(al);
    }
}