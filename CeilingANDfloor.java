package dsa;
import java.util.*;

public class CeilingANDfloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array");
        System.out.println("(NOTE: Array should be in sorted manner)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find in array");
        int target = sc.nextInt();
        
//                    ~~~~~~BY BINARY SEARCH~~~~~~        

        System.out.println("Smallest number greater than target is");
        int ans = GREATER(arr,target);
        if(ans < 0){
            System.out.println("Target might have exceeded the elements in Array");
        }
        if(ans >= 0){
            System.out.println(arr[ans]);
        }
        
        System.out.println("Greteast number smaller than target is");
        int ans2 = SMALLER(arr,target);
        if(ans2 < 0){
            System.out.println("Target might have exceeded the elements in Array");
        }
        if(ans2 >= 0){
            System.out.println(arr[ans2]);
        }
    }

    private static int GREATER(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        if(arr[start] < arr[end]){
            int mid = AscendingGREATER(arr,start,end,target);
            return mid;
        }
        if(arr[start] > arr[end]){
            int mid = DescendingGREATER(arr,start,end,target);
            return mid;
        }
        return -1;
    }

    private static int SMALLER(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        if(arr[start] < arr[end]){
            int mid = AscendingSMALLER(arr,start,end,target);
            return mid;
        }
        if(arr[start] > arr[end]){
            int mid = DescendingSMALLER(arr,start,end,target);
            return mid;
        }
        return -1;
    }

    private static int AscendingGREATER(int[] arr,int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
        }
        return start;
    }

    private static int DescendingGREATER(int[] arr,int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                start = mid + 1;
            }else
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
        }
        return end;
    }

    private static int AscendingSMALLER(int[] arr, int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
        }
        return end;
    }

    private static int DescendingSMALLER(int[] arr, int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                start = mid + 1;
            }else
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
        }
        return start;
        
        
//                                     ~~~~~~BY REGULAR METHOD~~~~~~        
//        int h = arr[0];
//        int l = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > arr[0]){
//                h = arr[i];
//            }
//            if(arr[0] > arr[i]){
//                l = arr[i];
//            }
//        }
//        int ans = SmallestElementGreater(arr,h,target);
//        System.out.println("Smallest element greater than Target element is "+ans);
//        
//        int ans2 = LargestElementSmaller(arr,l,target);
//        System.out.println("Largest element smaller than Target element is "+ans2);
//        
//        System.out.println("Smallest element smaller than Target element is "+l);
//        System.out.println("Largest element greater than Target element is "+h);
//    }
//
//    private static int SmallestElementGreater(int[] arr, int h, int tar) {
//        int ans = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > tar  &&  arr[i] <= h){
//                ans = arr[i];
//                h = arr[i];
//            }
//        }
//        return ans;
//    }
//
//    private static int LargestElementSmaller(int[] arr, int l, int tar) {
//        int ans = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < tar  &&  arr[i] >= l){
//                ans = arr[i];
//            }
//        }
//        return ans;
    }
}