package dsa;
import java.util.*;

public class CountNegativeINArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Size of an Array");
        int size = scan.nextInt();
        
        System.out.println("Enter the Array");
        int[][] arr = new int[size][size];
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr.length; j++) {
                arr1[j] = scan.nextInt();
            }
        }
        System.out.println("There are "+countNegatives(arr)+" Negative numbers in the Array");
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] grid1 : grid) {
                for (int j = 0; j < grid1.length; j++) {
                    if (grid1[j] < 0) {
                        count++;
                    }
                }
        }
        return count;
    }
}
