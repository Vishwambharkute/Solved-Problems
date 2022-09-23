package dsa;
//import java.util.*;

public class Search_In_Rotated_Array_With_No_Duplicates {
    public static void main(String[] args) {
        int[] Array = {4,5,6,7,8,9,0,1,2,3};
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
        int pivot_element = Find_Pivot(Array,0,Array.length-1);
        if(pivot_element == -1){
            return Binary_Search_Method_call(Array,Target,0,Array.length-1);
        }else
            if(Array[pivot_element] == Target){
                return pivot_element;
            }
        if(Target >= Array[0]){
            return Binary_Search_Method_call(Array,Target,0,pivot_element-1);
        }else{
            return Binary_Search_Method_call(Array,Target,pivot_element+1,Array.length-1);
        }
    }
    static int Find_Pivot(int[] Array,int start_index,int end_index){
        while(start_index<=end_index){
            int middle_element = start_index + ( end_index - start_index) / 2;
            if(middle_element < end_index && Array[middle_element] > Array[middle_element+1]){
                return middle_element;
            }
            if(middle_element > start_index && Array[middle_element] < Array[middle_element-1]){
                return middle_element -1;
            }
            if(Array[middle_element] <= Array[start_index]){
                end_index = middle_element-1;
            }else{
                start_index = middle_element + 1;
            }
        }
        return -1;
    }
    static int Binary_Search_Method_call(int[] Array,int Target,int start_index,int end_index){
        while(start_index<=end_index){
            int middle_element = start_index + ( end_index - start_index) / 2;
            if(Target == Array[middle_element]){
                return middle_element;
            }
            if(Target < Array[middle_element]){
                end_index = middle_element - 1;
            }else
                if(Target > Array[middle_element]){
                    start_index = middle_element + 1;
                }
        }
        return -1;
    }   
}