package dsa;

import java.util.*;

public class SwitchFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Fruit Name: ");
        String fruit = sc.next();
        
        switch(fruit){
//            using enhanced switch statements  
            case "Mango"->System.out.println("King of Fruits");
            case "Orange"->System.out.println("Round Fruit");
            case "Apple"->System.out.println("A Sweet Red Fruit");
            case "Grapes"->System.out.println("Small Fruit");
            default->System.out.println("Please enter valid fruit name only!!");
            
            
            
//            using Regular switch statements
            /*case "Mango":
                System.out.println("King of Friuts");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Apple":
                System.out.println("A Sweet Red Fruit");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Please enter valid fruit name only!!");*/
            
//            using switch and if statements
        }
    }
}
