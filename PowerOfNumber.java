package dsa;
import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        
        System.out.println("To the power of");
        int p = sc.nextInt();
        
        if(p == 0){
            System.out.println(n+" to the power "+p+" is 1");
            System.exit(0);
        }
        if(n == 0){
            System.out.println(n+" to the power "+p+" is 0");
            System.exit(0);
        }
        
        if(p > 0 && n > 0){
            int ans = 1;
            for (int i = 1; i <= p; i++) {
                ans *= n;
            }
            System.out.println(n+" to the power "+p+" is "+ans);
        }
        
        if(p > 0 && n < 0){
            int ans = 1;
//            n = n*-1;
            for (int i = 1; i <= p; i++) {
                ans *= Math.abs(n);
            }
            System.out.println(n+" to the power "+p+" is -"+ans);
        }
        if(p < 0 && n < 0){
            double ans = 1;
            for (int i = 1; i <= Math.abs(p); i++) {
                ans *= Math.abs(n);
            }
            ans =  1 / ans;
            System.out.println(n+" to the power "+p+" is -"+ans);
        }
        if(p < 0 && n > 0){
            double ans = 1;
            for (int i = 1; i <= Math.abs(p); i++) {
                ans *= n;
            }
            ans =  1 / ans;
            System.out.println(n+" to the power "+p+" is "+ans);
        }
    }
}