package dsa;

import java.util.Arrays;

public class printArray {
    public static void main(String[] args) {
        int[] numbers = {3,5,6,9};
//        for printing array one-by-one && line-by-line
        for(int n:numbers){
            System.out.print(n+" ");
        }
//                for printing array in a string
            System.out.println();
            System.out.println(Arrays.toString(numbers));
    }
}
