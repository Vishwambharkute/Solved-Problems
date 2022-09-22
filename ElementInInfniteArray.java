package dsa;
import java.util.*;

public class ElementInInfniteArray {
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
        
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end= 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + ( end - start + 1 ) * 2;
            start = newStart;
        }
        return binary(arr,target,start,end);
    }

    static int binary(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}