package dsa;

import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//~~~~~~BY TAKING INPUTS BY NORMAL LOOP~~~~~~
        int[][] arr = new int[3][3];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col]=sc.nextInt();
//            }  //for loop 2  closed
//        }      //for loop 1  closed
//~~~~~~BY TAKING INPUTS BY ENHANCED LOOP~~~~~~
        for (int[] scan:arr) {
            for (int col = 0; col < scan.length; col++) {
                scan[col]=sc.nextInt();
            }  //for loop 2  closed
        }      //for loop 1  closed
        
//        System.out.println("~~~Using Normal For Loop~~~");
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }  //for loop 2  closed
//            System.out.println();
//        }      //for 1 loop  closed
        System.out.println("~~~Using Enhanced For Loop~~~");
        for (int[] x: arr) {
            for (int col = 0; col < x.length; col++) {
                System.out.print(x[col]+" ");
            }  //for loop 2  closed
            System.out.println();
        }      //for loop 1  closed
/*~~~~~~BY NOT TAKING INPUTS~~~~~~   i.e.~~~~~~//BY INITIALIZING AN 2D-ARRAY~~~~~~
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("~~~Using Normal For Loop~~~");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }  //for loop 2  closed
            System.out.println();
        }      //for 1 loop  closed
//        System.out.println("~~~Using Enhanced For Loop~~~");
//        for (int[] x: arr) {
//            for (int col = 0; col < x.length; col++) {
//                System.out.print(x[col]+" ");
//            }  //for loop 2  closed
//            System.out.println();
//        }      //for loop 1  closed
*/
/*~~~~~~USING Arrays.toString();  METHOD~~~~~~
        for (int row = 0; row < arr.length; row++) {
            System.out.print(Arrays.toString(arr[row]));
            System.out.println();
        }
*/
    }
}
