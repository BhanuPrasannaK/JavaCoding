public class SumExist{
    public static void main(String[] args){
        int n=5;
        int target=15;
        int a[] = {2,6,5,8,11};
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==target){
                    System.out.println("YES");
                    flag=true;
                    System.out.println( "[" + i + "," + j + "]" );
                    break;
                }
            }
            if(flag) break;
        }
        if(!flag) System.out.println("NO\n[-1,-1]" );
    }
}