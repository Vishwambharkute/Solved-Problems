package dsa;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number: ");
          System.out.println("Print Armstrong Numbers Till: ");
          int n=sc.nextInt();
//        System.out.println(isArmstrong(n));       //~~~CHECK WHEATHER ARMSTRONG~~~
          for(int i=1;i<=n;i++){                   //~~~PRINT ALL ARMSTROMG NUMBERS~~~
              if(isArmstrong(i)){
                  System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        while(n>0){
            int remd=n%10;
            n /=10;
            sum +=remd*remd*remd;
        }
        return sum == org;
    }
}
