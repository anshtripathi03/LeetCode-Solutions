# Title: Plus One
# Submission ID: 1923432470
# Status: Accepted
# Date: February 18, 2026 at 09:19:04 PM GMT+5:30

class Solution {
    public int[] plusOne(int[] digits) {
        int i= digits.length-1;
        for(int n=i;n>=0;n--){
            if(digits[n]<9){
                digits[n]++;
                return digits;
            }
            else{
                digits[n]=0;
            }
        }

        int [] result = new int [digits.length+1];
        result[0]=1;
        return result;
    }
}