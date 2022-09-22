package dsa;
import java.util.*;

public class ConcatenatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[arr.length*2];
//COPYING elements of arr to ans       
        System.arraycopy(arr, 0, ans, 0, arr.length);
//Getting remaining array = ans        
        for (int i = arr.length; i < ans.length; i++) {
            ans[i] = arr[i-arr.length];
        }
        System.out.println("Concatenation of Array is");
        System.out.println(Arrays.toString(ans));
    }
}