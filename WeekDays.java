package dsa;

import java.util.*;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day No: ");
        //String day = sc.next();  //can also be used
        int day = sc.nextInt();
        
        switch(day){
//Printing whether it is weekday or weekend

            /*case 1,2,3,4,5->System.out.println(Weekdays);
            case 6,7->System.out.println(Weekends);
            default->System.out.println(Invalid day!!);*/
            
//Enhanced switch statement
            
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tueday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
            default->System.out.println("Invalid day!!");
            
//Regular switch statement
            
            /*case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day!!");*/    
        }
    }
}
