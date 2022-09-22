package dsa;
import java.util.*;

public class SearchInsertPosition {
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
        
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target < nums[m]){
                e=m-1;
            }else
            if(target > nums[m]){
                s=m+1;
            }else{
                return m;
            }
        }
        return s;
    }
}