public class RemoveDuplicates{
    //Time Complexity O(n)
    //Space Complexity O(1)
    public static void main(String[] args){
        int a[]={1,1,2,2,2,3,3};
        int b=removeDuplicates(a);
        for(int i=0;i<=b;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int removeDuplicates(int[] a){
        int i=0;
        for(int j=1; j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        return i;
    }
}