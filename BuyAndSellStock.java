public class BuyAndSellStock{
    public static void main(String []args){
        int prices[] = {7,6,4,3,1};
        int profit = stock(prices);
        System.out.println(profit);
    }
    static int stock(int[] a){
        int min=a[0];
        int ind=0;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
                ind=i;
            }
        }
        if(min==a[a.length-1]) return 0;
        int max=a[ind+1];
        for(int i=ind+2; i<a.length;i++){
            if(max<a[i]) max=a[i];
        }
        return max-min;
    }
}
/*
Time complexity O(n)
Space complexity O(1)
import java.util.*;

public class Main {

    public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};

    int maxPro = maxProfit(arr);
    System.out.println("Max profit is: " + maxPro);

    }
    static int maxProfit(int[] arr) {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
    }
}
*/