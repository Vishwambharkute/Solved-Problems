package dsa;
import java.util.*;

public class firstANDlastPOSITION {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size = scan.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the Target Element");
        int target = scan.nextInt();
        
        int[] ans;
//        ans = new int[2];    ***NOT NEEDED***
        if(arr[0] < arr[arr.length-1]){
            ans = searchRangeAAA(arr,target);
            System.out.println(Arrays.toString(ans));
        }else
            if(arr[0] > arr[arr.length-1]){
                ans = searchRangeBBB(arr,target);
                System.out.println(Arrays.toString(ans));
            }else
                if(arr[0] == arr[arr.length-1]){
                    int[] ans2 = {0,arr.length-1};
                    System.out.println(Arrays.toString(ans2));
                }
    }

    private static int[] searchRangeAAA(int[] arr, int target) {
        int[] ans = {-1,-1};
        
        int first = searchA(arr,target,true);
        int last = searchA(arr,target,false);
        
        ans[0] = first;
        ans[1] = last;
        
        return ans;
    }

    private static int searchA(int[] arr, int target, boolean WantFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }else
                if(target > arr[mid]){
                    start = mid +1;
                }else{
                    ans = mid;
                    if(WantFirstIndex){
                        end = mid -1;
                    }else{
                        start = mid +1;
                    }
                }
        }
        return ans;
    }

    private static int[] searchRangeBBB(int[] arr, int target) {
        int[] ans = {-1,-1};
        
        int first = searchB(arr,target,true);
        int last = searchB(arr,target,false);
        
        ans[0] = first;
        ans[1] = last;
        
        return ans;
    }

    private static int searchB(int[] arr, int target, boolean WantFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                start = mid +1;
            }else
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    ans = mid;
                    if(WantFirstIndex){
//                        start = mid +1;
                        end = mid -1;
                    }else{
                        start = mid +1;
//                        end = mid -1;
                    }
                }
        }
        return ans;
    }
}