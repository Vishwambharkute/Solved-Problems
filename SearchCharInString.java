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
public class SearchCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String name = sc.nextLine();
 
// String here Cannot go empty because of scanner
// But without scanner we should use below condition also
        if(name.isEmpty()){
            System.out.println("String should not be Empty");
            System.exit(0);
        }
        
        System.out.println("Enter the Character you want to know");
        char c = sc.next().charAt(0);
        
        int At = chAt (name, c);
        
        boolean ans = search( name, c);
        
        if(ans == true){
            System.out.println("Element Present at index "+At);
        }else{
            System.out.println("Element Absent");
        }
        
    }
    static boolean search(String name, char c){
        if(name.length() == 0){
            return false;
        }
//~~~~~~For Each loop~~~~~~  
        for(char ch : name.toCharArray()){
            if(ch == c){
                return true;
            }
        }
//~~~~~~Regular for loop~~~~~~
//        for (int i = 0; i < name.length(); i++) {
//            if(c == name.charAt(i)){
//                return true;
//            }
//        }
        return false;
    }
    static int chAt(String name, char c){
        for (int i = 0; i < name.length(); i++) {
            if(c == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}