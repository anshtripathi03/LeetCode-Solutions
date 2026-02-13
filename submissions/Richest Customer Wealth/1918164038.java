# Title: Richest Customer Wealth
# Submission ID: 1918164038
# Status: Accepted
# Date: February 13, 2026 at 09:41:42 PM GMT+5:30

class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=0;
        for(int i=0; i<accounts.length; i++){
            int n=accounts[i].length,sum=0;
            for (int j=0; j<n ; j++){
                sum=sum+accounts[i][j];
            }
            if(sum>result){
                result=sum;
            }
        }
        return result;
    }
}