package dsa;

import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the Number");
        int naturalNumber=sc.nextInt();
        
        for(int i=1;i<=naturalNumber;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
