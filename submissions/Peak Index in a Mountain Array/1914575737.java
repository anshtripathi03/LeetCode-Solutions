# Title: Peak Index in a Mountain Array
# Submission ID: 1914575737
# Status: Accepted
# Date: February 10, 2026 at 04:57:48 PM GMT+5:30

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length - 2;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]<arr[mid-1]){
                end = mid - 1;
            } else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}