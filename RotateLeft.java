import java.util.*;
import java.io.*;
class RotateLeft{
    public static void main(String []args){
        int a[]={1,2,3,4,5};
        int x=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=x;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" "); //[2,3,4,5,1]
        }
    }
}