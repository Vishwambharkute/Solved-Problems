package dsa;
import java.util.*;

public class Linear_Search_In_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of Arrays");
        int noa = sc.nextInt();
        
        System.out.println("Enter the number of elements Each Array");
        int eles = sc.nextInt();
        
        int[][] arr = new int[noa][eles];
        System.out.println("Enter those "+eles+" Arrays");
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the Element you want to know in Array");
        int ele = sc.nextInt();
        
        int[] ans = search(arr,ele);
        System.out.println("Element ia at "+Arrays.toString(ans)+" in the Arrays");
        
        System.out.println();
        
        System.out.println("Enter 1 to Continue... or Enter 0 to exit");
        int enter = sc.nextInt();
        
        switch(enter){
            case 0:
                System.exit(0);
            
            case 1:
                System.out.println();
                System.out.println("Enter 'm' to get maximum number in Arrays");
                System.out.println("                    or                     ");
                System.out.println("Enter 'n' to get minimum number in Arrays");
                String enter2 = sc.next();
                
                switch(enter2){
                    case "m":
                        System.out.println("Maximum Number is "+max(arr));
                        break;
                    case "n":
                        System.out.println("Minimum Number is "+min(arr));
                        break;
                    default:
                        System.exit(0);
                }
            default:
                System.exit(0);
        }
        
//        if(enter == 0){
//            System.exit(0);
//        }
//        else{
//            if(enter == 1){
//                System.out.println();
//                System.out.println("Enter 'm' to get maximum number in Arrays");
//                System.out.println("                    or                     ");
//                System.out.println("Enter 'n' to get minimum number in Arrays");
//                String enter2 = sc.next();
//                
//                System.out.println();
//                
//                if("m".equals(enter2)){
//                    System.out.println("Maximum Number is "+max(arr));
//                }else{
//                    if("n".equals(enter2)){
//                        System.out.println("Minimum Number is "+min(arr));
//                    }
//                }
//            }
//        }
    }

    private static int[] search(int[][] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == ele){
                    return new int[] {i,j};
                }
            }
        }
    return new int[] {-1,-1};
    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];
                }
            }
        }
        return max;
    }

    private static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] < min) {
                    min = arr1[j];
                }
            }
        }
        return min;
    }
}