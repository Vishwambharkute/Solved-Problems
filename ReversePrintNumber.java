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
public class ReversePrintNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int rev=0;
        
        while(num>0){
            int remd=num%10;
            num/=10;   // i.e.   num = num / 10;
            
            rev=rev*10+remd;
        }
        System.out.println(rev);
    }
}
