# Title: Find First and Last Position of Element in Sorted Array
# Submission ID: 1914576112
# Status: Accepted
# Date: February 10, 2026 at 04:58:19 PM GMT+5:30

class Solution {
    public int[] searchRange(int[] nums, int target) {
      if(nums.length != 0){
        int start = 0;
        int end = nums.length - 1;
        int mid,x=-1,y=-1;
        while(start <= end){
          mid = (start + end)/2;
          if(target == nums[mid]){
            x=mid;
            end=mid-1;
          } else if(target < nums[mid]){
            end = mid - 1;
          } else if(target > nums[mid]){
            start = mid + 1;
          }
        }
        start = 0;
        end = nums.length - 1;
        while(start <= end){
          mid = (start + end)/2;
          if(target == nums[mid]){
            start=mid+1;
            y=mid;
          } else if(target < nums[mid]){
            end = mid - 1;
          } else if(target > nums[mid]){
            start = mid + 1;
          }
        }
        return new int[]{x,y};
      }
      return new int[]{-1, -1};
    }
}