package dsa;
import java.util.*;

public class Dsa {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
    /*When max is initiated as a  
        int max=a;
        
        if(b>max){
            max=b;
        }if(c>max){
            max=c;
        }
        System.out.println(max);*/
    
     /*When max is initiated as 0
           
           int max=0;
           
           if(b>a){
               max=b;
           }if(c>max){
               max=c;
           }
           System.out.println(max);*/ 
     
     
     int max = Math.max(c,Math.max(a, b));
        System.out.println(max);
    }
}
