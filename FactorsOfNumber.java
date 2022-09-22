package dsa;

import java.util.*;

public class FactorsOfNumber {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        
        System.out.println();
        
        if(num == 0){
            System.out.println("zero multiplied by any number is 'zero' itself");
            System.exit(0);
        }
        
        System.out.println("Factors of number "+num+" is");
        
        for (int i = 1; i <= num; i++) {
            if(num > 0  &&  num % i ==0){
                count++;
                System.out.print(i+" ");
            }
        }
        
        for (int i = num; i <= Math.abs(num); i++) {
            if(i > 0){
                break;
            }
            if(i == 0){
                    continue;
            }
            else
            {
                if(num % i == 0){
                    count++;
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
        
//IsPrime OR not
        if(count == 2){
            System.out.println("Number "+num+" is Prime Number");
            System.out.println();
            System.exit(0);
        }
    }
}