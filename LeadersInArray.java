import java.util.*;
public class LeadersInArray{
    //Time complexity O(N^2)
    public static void main(String []args){
        int a[]={10, 22, 12, 3, 0, 6};
        ArrayList<Integer> al=leadersInArray(a);
        for (int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
    public static ArrayList<Integer> leadersInArray(int[] a){
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<a.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                al.add(a[i]);
            }
        }
        al.add(a[a.length-1]);
        return al;
    }
}