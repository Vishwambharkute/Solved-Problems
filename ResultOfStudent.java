package dsa;
import java.util.*;

public class ResultOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String CN = "17GDJ582";
        String DM = "17ADN458";
        String CD = "17KJL213";
        String AI = "17VHG936";
        String OODA = "17YOP462";
        String OP = "17YCS502";
        
        int[] a = {56,25,84,96,35,26};
        int[] b = {96,89,23,48,25,67};
        int[] c = {85,96,42,36,15,26};
        int[] d = {42,39,56,25,11,22};
        int[] e = {45,89,62,15,32,95};
        
        // PERSON DETAILS
        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        
        System.out.println( name + " Enter your marks in each subject");
        
        System.out.print("Computer Networking: ");
        int cn = sc.nextInt();
        
        System.out.print("Discrete Mathematics: ");
        int dm = sc.nextInt();
        
        System.out.print("Compiler Design: ");
        int cd = sc.nextInt();
        
        System.out.print("Artificial Intelligence: ");
        int ai = sc.nextInt();
        
        System.out.print("Object Oriented Design & Analysis: ");
        int ooda = sc.nextInt();
        
        System.out.print("Open Elective: ");
        int op = sc.nextInt();
        
        if(cn > 100 ||  dm >100 || cd > 100 || ai > 100 || ooda > 100 || op > 100){
            System.out.println("Enter Valid Marks Only !!!");
            System.exit(0);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
//Sum of his marks
        int ss = cn+dm+cd+ai+ooda+op;
        
//Array of Student's Marks
        int[] std = {cn,dm,cd,ai,ooda,op};
        
//Array of the class        
        int[][] arr = {std,a,b,c,d,e};
//
//        System.out.println("Your Rank in class is : "+Rank(arr,ss));
//        System.out.println("You have scored "+percentage(ss)+" percentage in this GRADE");
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("      Student Name:        |                "+name+"                                                                       ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("      Degree & Branch :    |                B.Tech (Computer Science & Engineering)                                        ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("        SEM       |       Course Code       |             Course Name             |       Grade       |       Result       ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("         1        |         "+CN+"        |         Computer Networking         |         "+grcn(cn)+"         |    "+rescn(cn)+"     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("         1        |         "+DM+"        |         Discrete Mathematics        |         "+grdm(dm)+"         |    "+resdm(dm)+"     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("         1        |         "+CD+"        |           Compiler Design           |         "+grcd(cd)+"         |    "+rescd(cd)+"     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("         1        |         "+AI+"        |       Artificial Intelligence       |         "+grai(ai)+"         |    "+resai(ai)+"     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("         1        |         "+OODA+"        |  Object Oriented Design & Analysis  |         "+grooda(ooda)+"         |    "+resooda(ooda)+"     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("         1        |         "+OP+"        |            Open Elective            |         "+grop(op)+"         |    "+resop(op)+"     ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Rank : "+Rank(arr,ss)+" Percentage : "+percentage(ss));
        System.out.println();
        System.out.println();
    }

    private static int Rank(int[][] arr, int ss) {
        int rank = 1;
        
        for (int[] arr1 : arr) {
            int sum = 0;
            for (int arr2 : arr1) {
                sum += arr2;
            }
            if(sum > ss){
                rank += 1;
            }
        }
        
        return rank;
    }

    private static double percentage(int ss) {
        double total = 600;
        double per;
       
        if(ss >= 0){
            per = Math.round((ss/total)*100);
            return per;
        }
       
        return -1;
    }

    static String rescn(int cn) {
        String strcn = "";
        if(cn > 100){
            strcn = "-----";
        }
        if(cn >= 91){
            strcn = "Outstanding";
        }
        if(cn < 91 && cn >= 81){
            strcn = "Excellent";
        }
        if(cn < 81 && cn >= 71){
            strcn = "Very Good";
        }
        if(cn < 71 && cn >= 61){
            strcn = "Good";
        }
        if(cn < 61 && cn >= 50){
            strcn = "Average";
        }
        if(cn < 50){
            strcn = "Reappear*";
        }
        return strcn;
    }

    private static String resdm(int dm) {
        String strdm = "";
        if(dm > 100){
            strdm = "-----";
        }
        if(dm >= 91){
            strdm = "Outstanding";
        }
        if(dm < 91 && dm >= 81){
            strdm = "Excellent";
        }
        if(dm < 81 && dm >= 71){
            strdm = "Very Good";
        }
        if(dm < 71 && dm >= 61){
            strdm = "Good";
        }
        if(dm < 61 && dm >= 50){
            strdm = "Average";
        }
        if(dm < 50){
            strdm = "Reappear*";
        }
        return strdm;
    }

    private static String rescd(int cd) {
        String strcd = "";
        if(cd > 100){
            strcd = "-----";
        }
        if(cd >= 91){
            strcd = "Outstanding";
        }
        if(cd < 91 && cd >= 81){
            strcd = "Excellent";
        }
        if(cd < 81 && cd >= 71){
            strcd = "Very Good";
        }
        if(cd < 71 && cd >= 61){
            strcd = "Good";
        }
        if(cd < 61 && cd >= 50){
            strcd = "Average";
        }
        if(cd < 50){
            strcd = "Reappear*";
        }
        return strcd;
    }

    private static String resai(int ai) {
        String strai = "";
        if(ai > 100){
            strai = "-----";
        }
        if(ai >= 91 && ai <= 100){
            strai = "Outstanding";
        }
        if(ai < 91 && ai >= 81){
            strai = "Excellent";
        }
        if(ai < 81 && ai >= 71){
            strai = "Very Good";
        }
        if(ai < 71 && ai >= 61){
            strai = "Good";
        }
        if(ai < 61 && ai >= 50){
            strai = "Average";
        }
        if(ai < 50){
            strai = "Reappear*";
        }
        return strai;
    }

    private static String resooda(int ooda) {
        String strooda = "";
        if(ooda > 100){
            strooda = "-----";
        }
        if(ooda >= 91 && ooda <= 100){
            strooda = "Outstanding";
        }
        if(ooda < 91 && ooda >= 81){
            strooda = "Excellent";
        }
        if(ooda < 81 && ooda >= 71){
            strooda = "Very Good";
        }
        if(ooda < 71 && ooda >= 61){
            strooda = "Good";
        }
        if(ooda < 61 && ooda >= 50){
            strooda = "Average";
        }
        if(ooda < 50){
            strooda = "Reappear*";
        }
        return strooda;
    }

    private static String resop(int op) {
        String strop = "";
        if(op > 100){
            strop = "-----";
        }
        if(op >= 91 && op <= 100){
            strop = "Outstanding";
        }
        if(op < 91 && op >= 81){
            strop = "Excellent";
        }
        if(op < 81 && op >= 71){
            strop = "Very Good";
        }
        if(op < 71 && op >= 61){
            strop = "Good";
        }
        if(op < 61 && op >= 50){
            strop = "Average";
        }
        if(op < 50){
            strop = "Reappear*";
        }
        return strop;
    }

    private static String grcn(int cn) {
        String strcn = "";
        if(cn > 100){
            strcn = "-";
        }
        
        if(cn >= 91 && cn <= 100){
            strcn = "O";
        }
        if(cn < 91 && cn >= 81){
            strcn = "A";
        }
        if(cn < 81 && cn >= 71){
            strcn = "B";
        }
        if(cn < 71 && cn >= 61){
            strcn = "C";
        }
        if(cn < 61 && cn >= 50){
            strcn = "D";
        }
        if(cn < 50){
            strcn = "U";
        }
        return strcn;
    }

    private static String grdm(int dm) {
        String strdm = "";
        if(dm > 100){
            strdm = "-";
        }
        if(dm >= 91 && dm <= 100){
            strdm = "O";
        }
        if(dm < 91 && dm >= 81){
            strdm = "A";
        }
        if(dm < 81 && dm >= 71){
            strdm = "B";
        }
        if(dm < 71 && dm >= 61){
            strdm = "C";
        }
        if(dm < 61 && dm >= 50){
            strdm = "D";
        }
        if(dm < 50){
            strdm = "U";
        }
        return strdm;
    }

    private static String grcd(int cd) {
        String strcd = "";
        if(cd > 100){
            strcd = "-";
        }
        if(cd >= 91 && cd <= 100){
            strcd = "O";
        }
        if(cd < 91 && cd >= 81){
            strcd = "A";
        }
        if(cd < 81 && cd >= 71){
            strcd = "B";
        }
        if(cd < 71 && cd >= 61){
            strcd = "C";
        }
        if(cd < 61 && cd >= 50){
            strcd = "D";
        }
        if(cd < 50){
            strcd = "U";
        }
        return strcd;
    }

    private static String grai(int ai) {
        String strai = "";
        if(ai > 100){
            strai = "-";
        }
        if(ai >= 91 && ai <= 100){
            strai = "O";
        }
        if(ai < 91 && ai >= 81){
            strai = "A";
        }
        if(ai < 81 && ai >= 71){
            strai = "B";
        }
        if(ai < 71 && ai >= 61){
            strai = "C";
        }
        if(ai < 61 && ai >= 50){
            strai = "D";
        }
        if(ai < 50){
            strai = "U";
        }
        return strai;
    }

    private static String grooda(int ooda) {
        String strooda = "";
        if(ooda > 100){
            strooda = "-";
        }
        if(ooda >= 91 && ooda <= 100){
            strooda = "O";
        }
        if(ooda < 91 && ooda >= 81){
            strooda = "A";
        }
        if(ooda < 81 && ooda >= 71){
            strooda = "B";
        }
        if(ooda < 71 && ooda >= 61){
            strooda = "C";
        }
        if(ooda < 61 && ooda >= 50){
            strooda = "D";
        }
        if(ooda < 50){
            strooda = "U";
        }
        return strooda;
    }

    private static String grop(int op) {
        String strop = "";
        if(op > 100){
            strop = "-";
        }
        if(op >= 91 && op <= 100){
            strop = "O";
        }
        if(op < 91 && op >= 81){
            strop = "A";
        }
        if(op < 81 && op >= 71){
            strop = "B";
        }
        if(op < 71 && op >= 61){
            strop = "C";
        }
        if(op < 61 && op >= 50){
            strop = "D";
        }
        if(op < 50){
            strop = "U";
        }
        return strop;
    }
}