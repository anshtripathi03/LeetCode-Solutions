# Title: Find Numbers with Even Number of Digits
# Submission ID: 1918164833
# Status: Accepted
# Date: February 13, 2026 at 09:42:28 PM GMT+5:30

class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for (int element : nums){
            int use=element,count=0;
            while (use>0){
                use=use/10;
                count++;
            }
            if(count%2 ==0){
                even++;
            }
        }
        return even;
    }
}