package dsa;

import java.util.*;

public class SwitchINSwitch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter year of Admission: ");
         int year = sc.nextInt();
         
         System.out.println("Enter City of College: ");
         String city = sc.next();
         
         System.out.print("Enter Your First Name: ");
         System.out.println("~~~~~~~~~CAPITAL CASES ONLY~~~~~~~~~~~");
         
         String name = sc.next();
         
         switch(year){
             //Regular switch
             case 2019:
                 switch(city){
                     //Regular switch
                     case "Nashik":
                         switch(name){
                             //Enhanced switch
                             case "VISHWAMBHAR"->System.out.println("19SUN0418");
                             case "SAHIL"->System.out.println("19SUN0419");
                             case "KUNAL"->System.out.println("19SUN0432");
                             default->System.out.println("INVALID CANDIDATE!!");
                         }
                         break;
                     case "Delhi":
                         switch(name){
                             //Enhanced switch
                             case "AMAY"->System.out.println("19SUD25869");
                             case "NIRAJ"->System.out.println("19SUN25458");
                             case "RAHUL"->System.out.println("19SUN25426");
                             default->System.out.println("INVALID CANDIDATE!!");
                         }
                         break;
                 }
         }
    }
}
//                             case "VISHWAMBHAR":
//                                 System.out.println("19SUN0418");
//                                 break;
//                             case "SAHIL":
//                                 System.out.println("19SUN0419");
//                                 break;
//                             case "KUNAL":
//                                 System.out.println("19SUN0432");
//                                 break;
//                             case "PRADEEP":
//                                 System.out.println("19SUN0456");
//                                 break;
//                             default:System.out.println("INVALID CANDIDATE!!");




//                             case "AMAY":
//                                 System.out.println("19SUD25869");
//                                 break;
//                             case "NIRAJ":
//                                 System.out.println("19SUN25458");
//                                 break;
//                             case "RAHUL":
//                                 System.out.println("19SUN25426");
//                                 break;
//                             default:System.out.println("Invalid Candidate!!");