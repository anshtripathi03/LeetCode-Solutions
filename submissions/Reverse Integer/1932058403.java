# Title: Reverse Integer
# Submission ID: 1932058403
# Status: Accepted
# Date: February 26, 2026 at 10:57:53 PM GMT+5:30

class Solution {
    public int reverse(int x) {
        int rev=0,num=Math.abs(x);
        while(num>0){
        if(rev<=Integer.MAX_VALUE/10){
            rev= rev*10 + num%10;
            num/=10;
        }
        else{
                return 0;
        }
        }
        if(x>0){
            return rev;         
        }
        else{
            return -rev;
        }
    }
}