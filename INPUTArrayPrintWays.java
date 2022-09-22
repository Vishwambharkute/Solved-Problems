package dsa;

import java.util.*;

public class INPUTArrayPrintWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n=arr.length;  // This is optional use if you want. Otherwise, just use arr.length in loop
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
            System.out.println("~~~~~~Using Normal for loop~~~~~~");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("~~~~~~Using Enhanced for loop~~~~~~");
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
            System.out.println("~~~~~~Using (Arrays.toString()) Method~~~~~~");
            System.out.println(Arrays.toString(arr));
    }
}
