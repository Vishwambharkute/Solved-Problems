package dsa;
import java.util.*;

public class FactorialOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println();
        
        if(n == 0){
//            System.out.println("Factorial of "+n+" is 1");
            System.out.println("0! = 1");
            System.exit(0);
        }
        int sna = 1;
        if(n < 0){
            for (int i = Math.abs(n); i > 0; i--) {
                sna *= i;
            }
//            System.out.println("Factorial of "+n+" is -"+sna);
            System.out.println(n+"! = "+sna);
        }
        int ans = 1;
        if(n > 0){
            for (int i = n; i > 0; i--) {
                ans *= i;
            }
//            System.out.println("Factorial of "+n+" is "+ans);
            System.out.println(n+"! = "+ans);
        }
        
    }
}