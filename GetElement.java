import java.util.*;
public class GetElement{
    public static void main(String []args){
        int a[]={4,4,1,2,1,3,2};
        int num=getSingleElement(a);
        System.out.println(num);
    }
    public static int getSingleElement(int[] a){
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                i++;
            }
            else return a[i];
        }
        return a[a.length-1];
    }
}
/*


import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}

*/