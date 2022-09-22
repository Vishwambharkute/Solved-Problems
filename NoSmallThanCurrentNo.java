package dsa;
import java.util.*;

public class NoSmallThanCurrentNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        
        System.out.println("Enter the Array");
        int[] arr = new int[s];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    count++;
                }
            }
            System.out.print(count+",");
        }
        System.out.println();
    }
}