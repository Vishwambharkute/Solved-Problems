package dsa;
import java.util.*;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.YearMonth;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = YearMonth.now().getYear();
        int month = YearMonth.now().getMonthValue();
        int today = month*10000 + year;
        System.out.println("Enter your birth Month");
        int m = sc.nextInt();
        System.out.println("Enter your birth Year");
        int y = sc.nextInt();
        int dob = m*10000 + y;
        
        int age = Age(today,dob);
        if(age == 18){
            System.out.println("You can apply as Voter now");
            System.exit(0);
        }
        if(age < 18){
            System.out.println("You are not eligible to Vote");
            System.exit(0);
        }
        if(age > 18){
            System.out.println("You are eligible to Vote");
            System.exit(0);
        }
    }

    private static int Age(int today, int dob) {
       int age = today - dob;
       return age;
    }
}