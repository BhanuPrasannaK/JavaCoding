import java.util.*;
public class RotateLeftOrRightByK{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter k value : ");
        int k=sc.nextInt();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
          //  a=leftRotate(a,k);
       
            a=rightRotate(a,k);
          System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] leftRotate(int[] a,int k){
        int temp[]=new int[k];                              //[1,2,3,4,5]
        int n=a.length;
        for(int i=0,j=0;i<k;i++,j++){                       //[3,4,5,1,2]
            temp[i]=a[j];
        }
        for(int i=0;i<n-k;i++){
            a[i]=a[k+i];
        }
        for(int j=0;j<temp.length;j++){
            a[n-k]=temp[j];                                 //[1,2,3,4,5]
            k--;                                            //[4,5,1,2,3]
        }
        return a;
    }
    public static int[] rightRotate(int[] a,int k){     
        int temp[]=new int[a.length-k];    

        for(int i=0,j=0;i<a.length-k;i++,j++){          
            temp[i]=a[j];
        }
        for(int i=a.length-k,j=0;i<a.length;j++,i++){
            a[j]=a[i];
        }
        
        for(int j=0;j<temp.length;j++){
            a[k+j]=temp[j];                                 
        }
        return a;
    }
}
/*
 Using ” Reversal Algorithm “

Approach:

For Rotating Elements to right
Step 1: Reverse the last k elements of the array

Step 2: Reverse the first n-k elements of the array.

Step 3: Reverse the whole array.

For Eg , arr[]={1,2,3,4,5,6,7} , k=2

Code:
import java.util.*;
public class Main {
  // Function to Reverse the array
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to right
  public static void Rotateeletoright(int[] arr, int n, int k) {
    // Reverse first n-k elements
    Reverse(arr, 0, n - k - 1);
    // Reverse last k elements
    Reverse(arr, n - k, n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    Rotateeletoright(arr, n, k);
    System.out.print("After Rotating the k elements to right ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
Output:

After Rotating the k elements to right 6 7 1 2 3 4 5

Time Complexity - O(N) where N is the number of elements in an array

Space Complexity - O(1) since no extra space is required
*/
/*
For Rotating Elements to left
Step 1: Reverse the first k elements of the array

Step 2: Reverse the last n-k elements of the array.

Step 3: Reverse the whole array.

For Eg , arr[]={1,2,3,4,5,6,7} , k=2

Code:
import java.util.*;
public class Main {
  // Function to Reverse the array
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to left
  public static void Rotateeletoleft(int[] arr, int n, int k) {
    // Reverse first k elements
    Reverse(arr, 0, k - 1);
    // Reverse last n-k elements
    Reverse(arr, k , n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    Rotateeletoleft(arr, n, k);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
Output:

After Rotating the k elements to left 3 4 5 6 7 1 2

Time Complexity - O(N) where N is the number of elements in an array

Space Complexity - O(1) since no extra space is required

*/