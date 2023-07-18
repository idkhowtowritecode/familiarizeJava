/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        if (nums.length == 1)
            return true;

        for (int i = 0; i < nums.length; i++) {
            if (max < i)
                return false;
            if (max < i + nums[i])
                max = i + nums[i];
        }
        return true;
    }
}
// @lc code=end
