package dsa;
import java.util.*;

public class NumberANDitsDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size");
        int size = scan.nextInt();
        
        System.out.println("Array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
//        System.out.println("Target");
//        int target = scan.nextInt();
        
        int[] ans = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] * 2 == arr[j]){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}