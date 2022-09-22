package dsa;
import java.util.*;

public class ArrangingCoinsAsStaircase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coins");
        int n = scan.nextInt();
        
        int count = 0;
        for (int i = 1; i > 0; i++) {
            if( n-i > 0  || n-i == 0){
                count++;
                n = n-i;
            }
        }
        System.out.println(count+" complete rows of staircases can be builted by coins");
    }
}