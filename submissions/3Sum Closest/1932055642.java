# Title: 3Sum Closest
# Submission ID: 1932055642
# Status: Accepted
# Date: February 26, 2026 at 10:55:27 PM GMT+5:30

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){         
            int left=i+1;
            int right = nums.length-1;
            while(left<right){
                int comp=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-comp) < Math.abs(target-sum)){
                    sum=comp;
                }
                if(comp<target){
                    left++;
                }
                else if(comp > target){
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return sum;
    }
}