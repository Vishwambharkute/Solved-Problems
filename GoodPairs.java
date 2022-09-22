package dsa;
import java.util.*;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        
        System.out.println("Enter the Array");
        int[] arr = new int[s];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Good pairs in the Array are");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.print("{"+i+","+j+"}");
                }
            }
        }
        System.out.println();
        System.out.println();
    }
}