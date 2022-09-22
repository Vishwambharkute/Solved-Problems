//package dsa;
//import java.util.*;
//
//public class demo {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Size");
//        int size = scan.nextInt();
//        
//        System.out.println("Array");
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }
//        System.out.println("Target");
//        int target = scan.nextInt();
//        
//        
//    }
//}
package dsa;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Size");
        int size = scan.nextInt();
        
        System.out.println("Array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Target");
        int target = scan.nextInt();
        
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int pivot = searchpivot(nums);
        if(nums[pivot]==target){
            return pivot;
        }else
            if(pivot==-1){
                return binary(nums,target,0,nums.length-1);
            }else{
                int x = binary(nums,target,0,pivot);
                if(x>=0 && x<nums.length){
                    return x;
                }else{
                    int y = binary(nums,target,pivot+1,nums.length);
                    if(y>=0){
                        return y;
                    }
                }
            }
        return -1;
    }

    static int searchpivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + ( end - start ) / 2;
            if(nums[mid] > nums[mid+1]){
                return mid;
            }else
                if(nums[mid] < nums[mid-1]){
                    return mid-1;
                }else
                    if(nums[mid] < nums[mid+1]){
                        start = mid+1;
                    }else
                        if(start > nums[mid]){
                            end = mid-1;
                        }
        }
        return -1;
    }

    static int binary(int[] nums, int target, int start, int end) {
        while(start<=end){
            int mid = start + ( end - start ) / 2;
            if(target > nums[mid]){
                start = mid+1;
            }else
                if(target < nums[mid]){
                    end = mid-1;
                }else
                    if(target == mid){
                        return mid;
                    }
        }
        return -1;
    }
}