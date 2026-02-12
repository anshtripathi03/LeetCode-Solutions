# Title: Add Digits
# Submission ID: 1917053633
# Status: Accepted
# Date: February 12, 2026 at 08:20:07 PM GMT+5:30

class Solution {
    public int addDigits(int num) {
        int t = num, sum = 0, digit;
        while(t>0){
            digit = t%10;
            sum+= digit;
            t=t/10;
            if(t==0 && sum > 9){
                t = sum;
                sum = 0;
            }
        }
        return sum;
    }
}