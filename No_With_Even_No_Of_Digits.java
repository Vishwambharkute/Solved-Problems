package dsa;
import java.util.*;

public class No_With_Even_No_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Array Size");
        int as = sc.nextInt();
        
        int[] arr = new int[as];
        System.out.println("Enter the Array");
        
        for (int i = 0; i < as; i++) {
            arr[i] = sc.nextInt();
        }
        
//        System.out.println("Number of numbers with odd number of digits is "+findodd(arr));
//        System.out.println("Number of numbers with even number of digits is "+findeven(arr));
//        System.out.println("There are "+findodd(arr)+" Odd numbers");
//        System.out.println("There are "+findeven(arr)+" Even numbers");
        switch (findeven(arr)) {
            case 1:
                System.out.println("There is only "+findeven(arr)+" Even number in Array");
                break;
            case 0:
                System.out.println("No Even Number in Array");
                break;
            default:
                System.out.println("There are "+findeven(arr)+" Even numbers in Array");
                break;
        }
        
        switch (findodd(arr)) {
            case 1:
                System.out.println("There is only "+findodd(arr)+" Odd number in Array");
                break;
            case 0:
                System.out.println("No Odd Number in Array");
                break;
            default:
                System.out.println("There are "+findodd(arr)+" Odd numbers in Array");
                break;
        }
    }

    private static int findeven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int nODigits = digitseven(num);
        return nODigits % 2 == 0;
    }

    private static int digitseven(int num) {
//   Best Case here!
        return (int)(Math.log10(num)+1);

//        int count = 0;
//        if(num < 0){
//            num *= -1;
//        }
//        if(num == 0){
//            return 1;
//        }
//        while(num > 0){
//            count++;
//            num /=10;
//        }
//        return count;
    }

    private static int findodd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(odd(arr[i])){
                count++;
            }
        }
        
        return count;
    }

    private static boolean odd(int num) {
        int nOdigits = digitsodd(num);
        return nOdigits % 2 != 0;
    }

    private static int digitsodd(int num) {
//    Best Case here!    
        return (int)(Math.log10(num)+1);
                
//        int count = 0;
//        if(num < 0){
//            num *= -1;
//        }
//        if(num == 0){
//            return 1;
//        }
//        
//        while(num > 0){
//            count++;
//            num /= 10;
//        }
//        return count;
    }
}