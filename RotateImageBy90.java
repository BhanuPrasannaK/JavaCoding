import java.util.*;
public class RotateImageBy90{
    //Time complexity O(n)
    public static void main(String []args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> al=rotate(a);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+"   ");
        }
    }
    static ArrayList<Integer> rotate(int[][]a){
        ArrayList<Integer> al=new ArrayList<Integer>();
        int top=0;
        int bottom=a.length;
        int left=0;
        int right=a[0].length;
        while(left<right){
            for(int i=bottom-1;i>=top;i--)
                al.add(a[i][left]);
            left++;
        }
        return al;
    }
}
//output:
// java RotateImageBy90      
// 7   4   1   8   5   2   9   6   3 