package dsa;
import java.util.*;
public class Maximum_Frequency_in_an_Array {
    public static void main(String[] args) {
        int[] array = {1,8,4,13};
        // maximum increment that can be performed in the array 
        int k = 5;
        // function to find maximum frequency
        System.out.println(maxFrequency(array, k));
    }
    
    static int maxFrequency(int[] array, int k){
        Arrays.sort(array);
        int maxFreq = 0;     // defining maximum frequency initially as '0'
        int start = 0;
        int sum = 0;
        
        for (int end = 0; end < array.length; end++) {
            sum += array[end];
            
            while((end - start + 1)* array[end] - sum > k){
                sum = sum - array[start];
                start++;
            }
            maxFreq = Math.max(maxFreq, (end - start + 1));
        }
        return maxFreq;
    }
}