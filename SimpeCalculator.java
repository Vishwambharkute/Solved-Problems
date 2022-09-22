package dsa;

import java.util.*;

public class SimpeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        while (true) {
            System.out.println("Enter the operation to perform: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                    
                if (op == '+') {
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            }else
                if(op=='x' || op=='X'){
                    break;
                }else{
                    System.out.println("Invalid Operation!!");
                }
            System.out.println(ans);
        }
    }
}