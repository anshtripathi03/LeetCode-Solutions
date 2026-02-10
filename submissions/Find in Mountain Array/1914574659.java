# Title: Find in Mountain Array
# Submission ID: 1914574659
# Status: Accepted
# Date: February 10, 2026 at 04:56:22 PM GMT+5:30

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 1;
        int end = mountainArr.length() - 2;
        int max, maxp;
        int mid = 0;
        while(start < end){
            mid = (start + end) / 2;
            max = mountainArr.get(mid);
            int check = mountainArr.get(mid+1);
            if(max < check){
                start = mid + 1;
            } else if( max > check){
                end = mid;
            }
        }
        maxp = end;
        start = 0;
        while(start <= end){
            mid = ( start + end )/2;
            int check = mountainArr.get(mid);
            if(target == check){
                return mid;
            } else if(target < check){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = maxp;
        end = mountainArr.length() - 1;
        while(start <= end){
            mid = ( start + end )/2;
            int check = mountainArr.get(mid);
            if(target == check){
                return mid;
            } else if(target < check){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}