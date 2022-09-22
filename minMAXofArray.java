/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.*;

/**
 *
 * @author Vishwambhar kute
 */
public class minMAXofArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Array Size");
        int arrSize = sc.nextInt();
        
        int[] arr = new int[arrSize];
       
        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int MIN = minOfArr(arr);
        System.out.println("Minimum number in Array is "+MIN);
        
        int MAX = maxOfArr(arr);
        System.out.println("Maximum number in Arrat is "+MAX);
    }

    private static int minOfArr(int[] arr) {
        
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            
            if(arr[i] < min){
                min = arr[i];
            }
        }
    return min;
    }

    private static int maxOfArr(int[] arr) {
        
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
        
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}