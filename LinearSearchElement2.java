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
public class LinearSearchElement2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Array Size");
        int array_size = scanner.nextInt();
        
        if(array_size <=0){
            System.out.println("Array should not be Empty");
            System.exit(0);
        }
        
        System.out.println("Enter the Array");
        
        int[] array = new int[array_size];
        
        for (int index = 0; index < array_size; index++) {
            array[index]=scanner.nextInt();                  
        }
        
        System.out.println("Enter the element you want to know");
        int element = scanner.nextInt();
        
        int INDEX = linearSearch(array,element);  //calling the function
        
        System.out.println("Element " + element + " is at index " + INDEX);
    }

    static int linearSearch(int[] array, int element) {
//        if(array.length == 0){
//            System.out.println("Array is Empty");
//            System.exit(0);
//        }
        for (int index = 0; index < array.length; index++) {
            if(array[index] == element){
                return index;
            }
        }
        System.out.println("Element not found in the Array !!!");
        System.exit(0);
        return 0;
    }
}
