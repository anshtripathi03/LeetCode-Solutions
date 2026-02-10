# Title: Split Array Largest Sum
# Submission ID: 1914510691
# Status: Accepted
# Date: February 10, 2026 at 03:38:17 PM GMT+5:30

class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int mid;
        int max = 0, sum = 0;
        for(int i=0; i<n;i++){
            if(max < nums[i]){
                max = nums[i];
            }
            sum+=nums[i];
        }
        int subarrays;
        while(max<sum){
            mid = (max + sum)/2;
            subarrays = 1;
            int setcount=0;
            for(int i=0;i<n;i++){
                    if((setcount + nums[i]) > mid){
                        setcount = nums[i];
                        subarrays++;
                    } else {
                        setcount+=nums[i];
                    }
            }
            if(subarrays>k){
                max = mid + 1;
            } else {
                sum = mid;
            }
        }
        return max;
    }
}