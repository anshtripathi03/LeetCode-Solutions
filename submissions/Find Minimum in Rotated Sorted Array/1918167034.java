# Title: Find Minimum in Rotated Sorted Array
# Submission ID: 1918167034
# Status: Accepted
# Date: February 13, 2026 at 09:44:32 PM GMT+5:30

class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(mid-1 <0){
                if(mid+1 > nums.length-1){
                    return nums[mid];
                }
                else{
                    if(nums[mid]<nums[mid+1]){
                       return nums[mid]; 
                    }
                    else{
                        return nums[mid+1];
                    }
                }
            }
            if((nums[mid]<nums[mid+1]) && (nums[mid]<nums[mid-1])){
               return nums[mid];
            }
            else if((nums[mid]>nums[mid+1]) && (nums[mid]>nums[mid-1])){
                return nums[mid+1];
            }
            else if((nums[mid]<nums[mid+1]) && (nums[mid]>nums[mid-1])){
                if(nums[mid]>nums[left]){
                    if(nums[mid]<nums[right]){
                        return nums[0];
                    }
                    else{
                        left=mid+1;
                    }
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}