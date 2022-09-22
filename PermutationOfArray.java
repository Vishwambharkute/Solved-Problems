package dsa;
import java.util.*;

public class PermutationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elements in the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] >= s){
                System.out.println("These Array cannot be Permutated");
                System.exit(0);
            }
        }
        
        int[] per = new int[s];
        for (int i = 0; i < per.length; i++) {
            per[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(per));
    }
}