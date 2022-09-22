package dsa;
import java.util.*;

public class PalindromeORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Define String
        System.out.println("Enter the String");
        String check = sc.next();

        
/*Length of String
        int l = check.length();     // Not really required
*/


//        Create Char Array from String
        char[] c  = new char[check.length()];
//        Define Char Array
        for (int i = 0; i < check.length(); i++) {
            c[i] = check.charAt(i);
        }
//        if String is empty exit code
        if(check.isEmpty()){
            System.out.println("Enter the String Again !!!");
            System.exit(0);
        }
//        Checking whether palindrome or not
        int count = Count(c,check.length());
        boolean YesNo = EvenOdd(check.length());
        
        if(YesNo  &&  count == check.length()/2){
            System.out.println("String is Palindrome");
        }
        else
        {
           if(!YesNo  &&  count == (check.length()/2)+1){
                System.out.println("String is Palindrome");
           }
            else
            {
                System.out.println("String is not Palindrome");
                System.exit(0);
            }    
        }
        
    }

    private static int Count(char[] c , int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(c[i] == c[len-1]){
                count++;
            }
            len -= 1;
        }
        return count;
    }

    private static boolean EvenOdd(int l) {
        return l % 2 == 0;
    }
}