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
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the number you want in series: ");
        int n = sc.nextInt();
        
        System.out.println();
        System.out.println("Fibonacci Series Upto "+n+" number is as below");
        
        
        int count = 2;
        
        while(count <= n){
            int temp=b;
            b +=a;
            a=temp;
            count++;
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Number in the series at position "+n+" is ");
        System.out.println(b);
        System.out.println();
        System.out.println();
    }
}
