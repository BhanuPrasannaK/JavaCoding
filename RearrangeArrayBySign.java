public class RearrangeArrayBySign{
    public static void main(String []args){
        int arr[] = {1,2,-4,-5};
        int n=4;
        int a[]= rearrange(arr,n);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"   ");
        }
    }
    public static int[] rearrange(int[] a,int n){
        int b[]=new int[n/2];
        int c[]=new int[n/2];
        int j=0,k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0)  c[k++]=a[i];
            else    b[j++]=a[i];
        }
        int x=0;
        for(int i=0,l=0;i<b.length&&l<c.length;i++,l++){
            a[x++]=b[i];
            a[x++]=c[l];
        }
        return a;
    }
}