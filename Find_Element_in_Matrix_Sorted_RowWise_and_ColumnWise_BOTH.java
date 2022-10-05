package dsa;

import java.util.*;

public class Find_Element_in_Matrix_Sorted_RowWise_and_ColumnWise_BOTH {
    public static void main(String[] args) {
        int[][] mat = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 49;
        System.out.println(Arrays.toString(search(mat,target)));
    }
    static int[] search(int[][] mat,int target){
        int r = 0;
        int c = mat.length-1;
        
        while(r < mat.length && c >= 0){
            if(mat[r][c] == target){
                return new int[]{r,c};
            }else
                if(mat[r][c] < target){
                    r++;
                }else{
                    c--;
                }
        }
        return new int[]{-1,-1};
    }
}