# Title: Power of Two
# Submission ID: 1917046687
# Status: Accepted
# Date: February 12, 2026 at 08:12:54 PM GMT+5:30

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        String s = Integer.toBinaryString(n);
        int length = s.length();
        int c=0;
        while( c < length ){
            if( c == 0){
                if(s.charAt(c) == '0'){
                    return false;
                }
            } else {
                if( s.charAt(c) == '1'){
                    return false;
                }
            }
            c++;
        }
        return true;
    }
}