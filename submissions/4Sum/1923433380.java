# Title: 4Sum
# Submission ID: 1923433380
# Status: Compile Error
# Date: February 18, 2026 at 09:19:58 PM GMT+5:30

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int sum= nums[0]+nums[1]+nums[2]+nums[3];
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    int currentSum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(currentSum>sum)
                }
            }
        }
    }
}