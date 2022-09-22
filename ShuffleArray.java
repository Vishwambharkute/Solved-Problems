package dsa;
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        int x = 0;
        int y = s/2; 
        if(s % 2 == 0  &&  s != 0){
            System.out.println("Enter the Array");
            int[] arr = new int[s];
        
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = new int[s];
            for (int i = 0; i < ans.length; i++) {
                
                if( i % 2 == 0){
                    ans[i] = arr[x];
                    x++;
                }else{
                    ans[i] = arr[y];
                    y++;
                }
            }
            System.out.println(Arrays.toString(ans));
            
        }else{
            System.out.println("Array cannot be of Odd size or of Zero size");
            System.exit(0);
        }
    }
}