/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Vishwambhar kute
 */
public class printMultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//~~~~~~Integer Multi Array IN & OUT~~~~~~ 
        System.out.println("Enter the Number of Arrays: ");
        int x = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initializing ArrayList
        for (int i = 0; i < x; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println("Enter the Size of Array: ");
        int y = sc.nextInt();
        //INPUT
        System.out.println("Enter the "+(y*2)+" Elements of "+x+" Arrays: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        //OUTPUT
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        //SUM of an Arraysssssssssss
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum = sum + list.get(i).get(j);
            }
        }
//        System.out.println(sum);
//~~~~~~String Multi Array IN & OUT~~~~~~
//        System.out.println("Enter the Number of Arrays: ");
//        int x = sc.nextInt();
//        
//        ArrayList<ArrayList<String>> list = new ArrayList<>();
//          //Initializing ArrayList
//        for (int i = 0; i < x; i++) {
//            list.add(new ArrayList<>());
//        }
//        System.out.println("Enter the Size of Array: ");
//        int y = sc.nextInt();
//          //INPUT
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                list.get(i).add(sc.next());
//            }
//        }
//                //OUTPUT
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print(list.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
    }
}
