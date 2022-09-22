package dsa;
import java.util.*;

public class TakeUntilEntered0 {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
////~~~~~~sum of all entered numbers~~~~~~        
//        int sum = 0;
//        
//        while(true){
//            int x = sc.nextInt();
//            if(x == 0){
//                break;
//            }else{
//                sum += x;
//            }
//        }
//        System.out.println(sum);
        

//~~~~~~maximum out of entered numbers~~~~~~
//        int max = Integer.MIN_VALUE;
        
        while(true){
            int n = sc.nextInt();
            
            if(n == 0){
                break;
            }else{
                max = MAX(n);
//                if(n > max){
//                    max = n;
//                }
                 }
        }
        System.out.println("Maximum Number entered is "+max);
    }

    private static int MAX(int n) {
        
        if(n > max){
            max = n;
        }
        return max;
    }
}