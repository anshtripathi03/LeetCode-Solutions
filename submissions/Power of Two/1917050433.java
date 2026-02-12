# Title: Power of Two
# Submission ID: 1917050433
# Status: Accepted
# Date: February 12, 2026 at 08:16:45 PM GMT+5:30

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if( (n&(n-1)) == 0){
            return true;
        }
        return false;
    }
}