package dsa;

import java.util.ArrayList;
import java.util.*;

public class printArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//~~~~~~BASICS OF ARRAY~~~~~~
//        list.add(100);
//        list.add(1001);
//        list.add(10001);
//        System.out.println(list);
//        list.set(0, 1);                 //Add element at particular index
//        System.out.println(list);
//        list.remove(0);                 //Remove element at particular index
//        System.out.println(list);
//        System.out.println(list.get(0));   //Index '1' is now changed to Index '0' and so on....
//~~~~~~SCANNING & PRINTING ARRAY BY FOR LOOP~~~~~~
//        //Taking Inputs for Array
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
         System.out.println();
//        //Get element at any Index in Array 
         for (int i = 0; i < 3; i++) {
             System.out.print(list.get(i)+" ");
         }
    }
}
