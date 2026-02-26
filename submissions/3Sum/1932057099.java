# Title: 3Sum
# Submission ID: 1932057099
# Status: Accepted
# Date: February 26, 2026 at 10:56:47 PM GMT+5:30

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length >= 3) {
            List<List<Integer>> threesome = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i-1]) continue;
                int left = i + 1;
                int right= nums.length-1;
                
            while(left<right) {
                int sum = nums[i] + nums[left] + nums[right];
                        if (sum == 0) {
                            threesome.add(Arrays.asList(nums[i], nums[left],nums[right]));
                            while(left<right && nums[left] == nums[left+1]){
                        left++;
                            }
                            while(left<right && nums[right] == nums[right-1]){
                        right--;
                            }
                            left++;
                            right--;
                        }
                        else if(sum<0){
                            left++;
                        }
                        else{
                            right--;
                        }
                    }
                }
            return threesome;
        } else {
            return new ArrayList<>();
      }
    }
}