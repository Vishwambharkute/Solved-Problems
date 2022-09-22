package dsa;
import java.util.*;

public class minMAXofArrayBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = minEle(arr);
        int MAXans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[min]){
                MAXans += arr[i];
            }
        }
        System.out.println("Maximum sum of Array is "+MAXans);
        
        int max = maxEle(arr);
        int MINans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[max]){
                MINans += arr[i];
            }
        }
        System.out.println("Minimum sum of Array is "+MINans);
    }

    private static int minEle(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }

    private static int maxEle(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}