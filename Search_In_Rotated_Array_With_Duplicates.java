package dsa;
//import java.util.*;

public class Search_In_Rotated_Array_With_Duplicates {
    public static void main(String[] args) {
        int[] Array = {4,4,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,8,9,0,0,1,1,1,2,2,2,3,3,3};
        int Target = 3;
        
/*      //if want to take as input use Scanner
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scan.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the Target");
        int target = scan.nextInt();
*/
// Finding pivot number in the Array
        System.out.println("Pivot is "+Array[Find_Pivot(Array,0,Array.length-1)]);
// Finding index of the Target element
        System.out.println("Target is at index "+Search_Target(Array,Target));
    }
    static int Search_Target(int[] Array,int Target){
        int pivot_index = Find_Pivot(Array,0,Array.length-1);
        if(pivot_index == -1){
            return Binary_Search_Method_call(Array,Target,0,Array.length-1);
        }else
            if(Array[pivot_index] == Target){
                return pivot_index;
            }
        if(Target >= Array[0]){
            return Binary_Search_Method_call(Array,Target,0,pivot_index-1);
        }else{
            return Binary_Search_Method_call(Array,Target,pivot_index+1,Array.length-1);
        }
    }
    static int Find_Pivot(int[] Array,int start_index,int end_index){
        while(start_index<=end_index){
            int middle_index = start_index + ( end_index - start_index) / 2;
            if(middle_index < end_index && Array[middle_index] > Array[middle_index+1]){
                return middle_index;
            }
            if(middle_index > start_index && Array[middle_index] < Array[middle_index-1]){
                return middle_index -1;
            }
            if(Array[middle_index] == Array[start_index] && Array[middle_index] == Array[end_index]){
                if(Array[start_index] > Array[start_index+1]){
                    return start_index;
                }else{
                    start_index++;
                }
                if(Array[end_index] < Array[end_index-1]){
                    return end_index;
                }else{
                    end_index--;
                }
            }else
                if(Array[start_index] < Array[middle_index] || Array[start_index] == Array[middle_index] && Array[end_index] < Array[middle_index]){
                    start_index = middle_index+1;
                }else{
                    end_index = middle_index-1;
                }
        }
        return -1;
    }
    static int Binary_Search_Method_call(int[] Array,int Target,int start_index,int end_index){
        while(start_index<=end_index){
            int middle_index = start_index + ( end_index - start_index) / 2;
            if(Target == Array[middle_index]){
                return middle_index;
            }
            if(Target < Array[middle_index]){
                end_index = middle_index - 1;
            }else
                if(Target > Array[middle_index]){
                    start_index = middle_index + 1;
                }
        }
        return -1;
    }   
}