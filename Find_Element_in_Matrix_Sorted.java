package dsa;
import java.util.*;

public class Find_Element_in_Matrix_Sorted {
    public static void main(String[] args) {
// Given Sorted Matrix        
        int[][] matrix = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16}
        };
// Target to found in Matrix        
        int target = 16;
// OUTPUT        
        System.out.println(Arrays.toString(index_of_target(matrix,target)));
    }

// OUTPUT Function
    static int[] index_of_target(int[][] matrix, int target) {
        int total_rows = matrix.length;
        int total_columns = matrix[0].length;  // (BE CAUTIOUS: matrix may be empty)
        if(total_rows == 1){
            return binarySearch(matrix, 0, 0, total_columns-1, target);
        }
// Run the loop till 2 rows will be remaining
        int row_start = 0;
        int row_end = total_rows-1;
        int column_mid = total_columns/2;
        
        while(row_start < (row_end - 1)){ //while this is true matrix will still have more than 2 rows and we are going to reduce this matrix furthur to only 2 rows
            int mid_row = row_start + (row_end - row_start)/2;
            if(matrix[mid_row][column_mid] == target){
                return new int[]{mid_row,column_mid};
            }else
                if(matrix[mid_row][column_mid] < target){
                    row_start = mid_row;
                }else{
                    row_end = mid_row;
                }
        }
// now we have 2 rows remaining
// check whether target is in the column of 2 rows
        if(matrix[row_start][column_mid] == target){
            return new int[]{row_start, column_mid};
        }
        if(matrix[row_start + 1][column_mid] == target){
            return new int[]{row_start + 1, column_mid};
        }
// OTHERWISE
             // search in 1st half
                    if(target <= matrix[row_start][column_mid - 1]){
                        return binarySearch(matrix, row_start, 0, column_mid -1, target);
                    }
             // search in 2st half
                    if(target >= matrix[row_start][column_mid + 1] && target <= matrix[row_start][total_columns - 1]){
                        return binarySearch(matrix, row_start, column_mid + 1, total_columns - 1, target);
                    }
             // search in 3st half
                    if(target <= matrix[row_start + 1][column_mid - 1]){
                        return binarySearch(matrix, row_start + 1, 0,column_mid - 1, target);
                    }
             // search in 4st half
                    else{
                        return binarySearch(matrix, row_start + 1, column_mid +1, total_columns -1, target);
                    }
    }
    
    // Searching in row provided between the columns provided
    static int[] binarySearch(int[][]matrix, int row, int column_start, int column_end, int target){
        while(column_start <= column_end){
            int column_middle = column_start + (column_end - column_start) / 2;
            if(matrix[row][column_middle] == target){
                return new int[]{row, column_middle};
            }else
                if(matrix[row][column_middle] > target){
                    column_end = column_middle - 1;
                }else{
                    column_start = column_middle + 1;
                }
        }
        return new int[]{-1,-1};
    }
}
/*

~~~~~~SOLVED BY USINF THIS NAMES OF VARIABLES WHILE PRACTICE~~~~~~

package dsa;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        int[][] arr ={
            {       1,       11,       111},
            {    1111,    11111,    111111},
            { 1111111, 11111111, 111111111}
        };
        int tar = 111111;
        System.out.println(Arrays.toString(search(arr,tar)));
    }
    
    static int[] search(int[][] arr, int tar){
        int rows = arr.length;
        int cols = arr[0].length;
        if(rows == 1){
            return binary(arr, 0, 0, cols-1, tar);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;
        
        while(rstart < rend - 1){
            int rmid = rstart + (rend - rstart) / 2;
            if(arr[rmid][cmid] == tar){
                return new int[]{rmid, cmid};
            }else
                if(arr[rmid][cmid] < tar){
                    rstart = rmid;
                }else{
                    rend = rmid;
                }
        }
        if(arr[rstart][cmid] == tar){
            return new int[]{rstart, cmid};
        }else
            if(arr[rstart + 1][cmid] == tar){
                 return new int[]{rstart+1, cmid};
            }
        //1
        if(arr[rstart][cmid-1] >= tar){
            return binary(arr, rstart, 0, cmid-1, tar);
        }
        //2
        if(arr[rstart][cmid+1] <= tar && arr[rstart][cols-1] <= tar){
            return binary(arr, rstart, cmid+1, cols-1, tar);
        }
        //3
        if(arr[rstart + 1][cmid-1] >= tar){
            return binary(arr, rstart+1, 0, cmid-1, tar);
        }
        //4
        else{
            return binary(arr, rstart+1, cmid+1, cols-1, tar);
        }
    }
    static int[] binary(int[][] arr, int row, int cstart, int cend , int tar){
        while(cstart <= cend){
            int mid = cstart + (cend - cstart) /2;
            if(arr[row][mid] == tar){
                return new int[]{row, mid};
            }else
                if(arr[row][mid] < tar){
                    cstart = mid + 1;
                }else{
                    cend = mid - 1;
                }
        }
        return new int[]{-1, -1};
    }
}
*/