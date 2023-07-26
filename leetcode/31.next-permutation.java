/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
       /*
        * 1. finding the last peak element
        * 2. swap with nearest lower element
        * 3. sorting with ascending order after the peak element
        * Special case:
        * descending order => ascending order
        */
        boolean descendingFlag = true;
        int arrlen = nums.length;
        int peak = arrlen-1;
        int newPeak =0;

        if(arrlen == 1) return;
        // check descending case
        for(int i = arrlen-1;i > 0;i--){
            if(nums[i-1]<nums[i]) {
                peak = i;
                descendingFlag = false;
                break;
            }
        }
        if(descendingFlag){
            // reverse the array
            int temp,j;
            for(int i = 0; i <= (arrlen-1)/2;i++){
                j = arrlen-1 - i;
                temp = nums[j];
                nums[j]=nums[i];
                nums[i]= temp;
            }
            return;
        }
        int temp = 0;
        // find the nearest lower element's index
        for(int i = peak-1; i >= 0; i--){
            if(nums[i]<nums[peak]){
                newPeak = i;
                break;
            }
        }
        // Swap the new peak with the next greater element
        int nextgreater = arrlen-1;
        while (nums[nextgreater] <= nums[newPeak]) {
            nextgreater--;
        }
        temp = nums[newPeak];
        nums[newPeak] = nums[nextgreater];
        nums[nextgreater] = temp;

        // sorting
        java.util.Arrays.sort(nums, newPeak + 1, arrlen);
        return;
    }
}
// @lc code=end

