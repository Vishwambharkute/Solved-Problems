package dsa;
import java.util.*;

public class LinearSearchElementInArray {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Array Size
        System.out.println("Enter the Array Size: ");
        int Array_Size = input.nextInt();
        // if ArraySize = 0 then exit
        if(Array_Size <= 0){
            System.out.println("Array should not be Empty !!!");
            System.exit(0);
        }
        // create array
        int[] array = new int[Array_Size];
        // Define array
        System.out.println("Enter the Array: ");
        for (int index = 0; index < Array_Size; index++) {
           array[index]=input.nextInt();
        }
        // input element want to find
        System.out.println("Enter the Element You Want to find in Array: ");
        int element = input.nextInt();
        
        // choosing method/way to fing element
        System.out.println("~~~~~~Choose Appropriate Option below~~~~~~");
        
        System.out.println("1. Select to find Element in Specific Range");
        System.out.println("2. Select to find Element throughout the Array");
        
        // get input
        int enter1  = input.nextInt();
        
        // if to find in the range
        if(enter1 == 1){
            // range start
            System.out.println("Enter the starting index");
            int start = input.nextInt();
            // range end
            System.out.println("Enter the ending index");
            int end = input.nextInt();
            
            //call function gor index
            int getReturnInRange = EleInRangeAt(array,element,start,end);
            
            if(getReturnInRange >= 0){
                System.out.println("Element "+element+" is at index "+getReturnInRange);
            }
            else
            {
                System.out.println("Element "+element+" is not found in Array !!!"); 
            }
        }
        // if to find throughout array
        if(enter1 == 2){
            int getReturn = elementAt(array,element);
            if(getReturn >=0){
                System.out.println("Element "+element+" is at index "+getReturn);
            }
            else
            {
                System.out.println("Element "+element+" is not found in Array !!!");
            }
        }
        System.out.println();
        
        System.out.println("If want to perform operation in an array PRESS 1 or PRESS 0 to exit");
        int enter2 = input.nextInt();
        
        if(enter2 == 0){
            System.exit(0);
        }
        if(enter2 == 1){
            System.out.println("Enter one of the following operator to perform function throught an array");
        
            System.out.println("1. '+'\n2. '-'\n3. '*'");
        
        // Getting Operator to perform action
            String enter = input.next();
        
        // initial defining ans for reference
            int ans = 0;
            int ans2 = 1;
        
        // Checking operator
            if("1".equals(enter) || "2".equals(enter) || "3".equals(enter)){
            // calling math function to perform entered operation
                math(array,enter,Array_Size,ans,ans2);
            }
            else
            {
                System.out.println("Please Enter Valid Input !!!");
                System.exit(0);
            }
        }
        
//         static void math(int[]array, String enter,int Array_Size, int ans, int ans2){
//            // Addition
//            if("1".equals(enter)){
//                for (int i = 0; i < Array_Size; i++) {
//                    ans += array[i];
//                }
//            System.out.println("Sum of an all elements of an Array is\n"+ ans);
//            }
//            // Subtraction
//            if("2".equals(enter)){
//                for (int i = 0; i < Array_Size; i++) {
//                    ans -= array[i];
//                }
//            System.out.println("Substraction of an all elements of Array is\n"+ans);
//            }
//            // Multiplication
//            if("3".equals(enter)){
//                for (int i = 0; i < Array_Size; i++) {
//                    ans = array[i] * ans2;
//                    ans2 = ans;
//                }
//            System.out.println("Multiplication of an elements of Array is\n"+ans);
//            }
        } 

    private static int EleInRangeAt(int[] array, int element, int start, int end) {
        for (int index = start; index <= end; index++) {
            if(array[index] == element){
                return index;
            }
        }
        return -1;
    }

    private static void math(int[] array, String enter, int Array_Size, int ans, int ans2) {
            // Addition
            if("1".equals(enter)){
                for (int i = 0; i < Array_Size; i++) {
                    ans += array[i];
                }
                System.out.println("Sum of an all elements of an Array is\n"+ ans);
            }
            // Subtraction
            if("2".equals(enter)){
                for (int i = 0; i < Array_Size; i++) {
                    ans -= array[i];
                }
                System.out.println("Substraction of an all elements of Array is\n"+ans);
            }
            // Multiplication
            if("3".equals(enter)){
                for (int i = 0; i < Array_Size; i++) {
                    ans = array[i] * ans2;
                    ans2 = ans;
                }
                System.out.println("Multiplication of an elements of Array is\n"+ans);
            }
    }

    private static int elementAt(int[] array, int element) {
        for(int index =0; index < array.length; index++){
            if(array[index] == element){
                return index;
            }
        }
        return -1;
    }
}       
//        // performing different operations
//        System.out.println();
//        
//        System.out.println("Enter one of the following operator to perform function throught an array");
//        
//        System.out.println("1. '+'\n2. '-'\n3. '*'");
//        
//        // Getting Operator to perform action
//        String enter = input.next();
//        
//        // initial defining ans for reference
//        int ans = 0;
//        int ans2 = 1;
//        
//        // Checking operator
//        if("1".equals(enter) || "2".equals(enter) || "3".equals(enter)){
//            // calling math function to perform entered operation
//            math(array,enter,Array_Size,ans,ans2);
//        }
//        else
//        {
//            System.out.println("Please Enter Valid Input !!!");
//            System.exit(0);
//        }
//    }
//        
//        static void math(int[]array, String enter,int Array_Size, int ans, int ans2){
//            // Addition
//            if("1".equals(enter)){
//                for (int i = 0; i < Array_Size; i++) {
//                    ans += array[i];
//                }
//            System.out.println("Sum of an all elements of an Array is\n"+ ans);
//            }
//            // Subtraction
//            if("2".equals(enter)){
//                for (int i = 0; i < Array_Size; i++) {
//                    ans -= array[i];
//                }
//            System.out.println("Substraction of an all elements of Array is\n"+ans);
//            }
//            // Multiplication
//            if("3".equals(enter)){
//                for (int i = 0; i < Array_Size; i++) {
//                    ans = array[i] * ans2;
//                    ans2 = ans;
//                }
//            System.out.println("Multiplication of an elements of Array is\n"+ans);
//            }
//        }
// Method to get index of element throughout
//    static int elementAt(int[] array, int element) {
//        for(int index =0; index < array.length; index++){
//            if(array[index] == element){
//                return index;
//            }
//        }
//        return -1;
//    }
//// In the Range
//    static int EleInRangeAt(int[] array, int element, int start, int end) {
//        for (int index = start; index <= end; index++) {
//            if(array[index] == element){
//                return index;
//            }
//        }
//        return -1;
//    }
//}