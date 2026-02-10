# Title: Find Smallest Letter Greater Than Target
# Submission ID: 1914576653
# Status: Accepted
# Date: February 10, 2026 at 04:59:03 PM GMT+5:30

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length - 1;
        int mid;
        while( start <= end ){
          mid = (start + end)/2;
          if(start == end ){
            if(target < letters[mid]){
                return letters[mid];
            } else{
                return letters[0];
            }
          } else if(target >= letters[mid]){
            start = mid + 1;
          } else{
            end = mid;
          }
        }
        return letters[0];
    }
}