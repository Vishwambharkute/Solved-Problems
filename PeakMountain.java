package dsa;
import java.util.*;

public class PeakMountain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size");
        int size = scan.nextInt();
        
        System.out.println("Array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println(arr[ans(arr)]);
    }

    private static int ans(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + ( end - start ) / 2;
            
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}