# Title: Find a Peak Element II
# Submission ID: 1912823193
# Status: Accepted
# Date: February 9, 2026 at 01:29:24 AM GMT+5:30

class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int cstart = 0;
       int cend = mat[0].length - 1;
       int row,mid;
       while(cstart<cend){
        mid= cstart + (cend - cstart)/2;
        int[] index = greatestColElementIndex(mat, mid);
        int r = index[0];
        int c = index[1];
        int curr = mat[r][c];
        int left = (c - 1 < 0) ? -1 : mat[r][c - 1];
        int right = (c == mat[0].length - 1) ? -1 : mat[r][c + 1];
        if(curr < left){
            cend = mid - 1;
        } else if(curr < right){
            cstart = mid + 1;
        } else {
            return new int[]{r,c};
        }
       } 
       int[] index = greatestColElementIndex(mat, cstart);
       return index;
    }
    public int[] greatestColElementIndex(int[][] matrix, int col){
        int rend= matrix.length;
        int max=matrix[0][col],row=0;
        for(int i=0; i<rend; i++){
            if(max < matrix[i][col]){
                max = matrix[i][col];
                row = i;
            }
        }
        return new int[]{row,col};
    }
}