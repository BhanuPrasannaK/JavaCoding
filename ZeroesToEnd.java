public class ZeroesToEnd{
    //Time Complexity O(n)
    //Space Complexity O(1)
    public static void main(String []args){
        int a[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n=a.length;
        for(int j=0;j<n;j++){
            if(a[j]==0){
                int k=j;
                while(k<n-1){
                    a[k]=a[k+1];
                    k++;
                }
                a[k]=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

/*

import java.util.*;
public class tUf {
    public static int[] moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}

*/