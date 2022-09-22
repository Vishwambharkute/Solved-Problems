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
public class Repeatation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        
        for (int i = 0; i <= 10; i--) {
            System.out.println("Enter two numbers: ");
            String str1 = sc.next();
            String str2 = sc.next();
            
            if("[A||B]".equals(str1) || "[A||B]".equals(str2))
            {
                break;
            }
            else
            {
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                
                sum = num1 + num2;
                System.out.println(sum);
                
                System.out.println("Enter 'A' or 'B' to exit");
            }
        }
    }
}
