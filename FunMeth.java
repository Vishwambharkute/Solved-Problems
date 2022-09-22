package dsa;

import java.util.*;

public class FunMeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");  //~~~~~~Printing Greeting Message~~~~~~
        String name = sc.next();
        greet(name);
    }
    static void greet(String name){
        System.out.println("Hello"+" "+name);
        
        
        
/*      fun(1,2,3,4,5,6,7,8,9,0);      //~~~~~~Variable Arguments Infinite~~~~~~
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
*/
    }
}
