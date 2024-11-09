package leetcode;

/**
 * LeetCode:
 * 55. Jump Game
 * <a href='https://leetcode.com/problems/jump-game/description/'>
 */
public class JumpGame {

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        boolean result = false;
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= goal-i) {
                goal = i;
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {3,2,1,0,4}; // Input array
        System.out.println(canJump(nums));
    }
}
