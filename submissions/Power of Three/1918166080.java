# Title: Power of Three
# Submission ID: 1918166080
# Status: Accepted
# Date: February 13, 2026 at 09:43:38 PM GMT+5:30

class Solution {
    public boolean isPowerOfThree(int n) {
      int count=0,i=0,go=0;
        while(count==0){
            count=rem(i,n);
            i++;
        } 
        if(count==1){
            return true;
        }
        return false;
    }
    public int rem(int num,int target){
        if(Math.pow(3,num) == target){
            return 1;
        }
        else{
            if(Math.pow(3,num)>target){
            return 2;
            }
        }
        return 0;
    }
}