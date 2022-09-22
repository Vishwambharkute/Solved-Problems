package dsa;
import java.util.*;

public class BinarySearchFirstCode {
    static int start = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================   Searchig Element in Array by Binary Search   ====================");
        System.out.println();
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
        int ans = binarySearch(arr,target);
        if(ans < 0){         // OR we can say ans = -1
            System.out.println("Element not found in Array !!!");
        }else{
            System.out.println("Element "+target+" is at index "+ans);
        }
    }
    private static int binarySearch(int[] arr,int target) {
        int end = arr.length-1;
        if(arr[start] < arr[end]){
            int mid = Ascending(arr,end,target);
            return mid;
        }
        if(arr[start] > arr[end]){
            int mid = Descending(arr,end,target);
            return mid;
        }
        if(arr[start] == arr[end]){
            System.out.println("Element is same throughout the Array");
            System.exit(0);
        }
        return -1;
    }
    private static int Ascending(int[]arr,int end,int target) {
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
        return -1;
    }
    private static int Descending(int[]arr,int end,int target) {
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
        return -1;
    }
}