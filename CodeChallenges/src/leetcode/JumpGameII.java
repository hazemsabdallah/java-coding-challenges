package leetcode;

/**
 * LeetCode:
 * 55. Jump Game
 * <a href='https://leetcode.com/problems/jump-game-ii/description/'>
 */
public class JumpGameII {

    public static int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int goal = nums.length - 1, count = 0;
        for (int i = 0; i < goal; i++) {
            if (nums[i] >= goal-i) {
                goal = i;
                i = -1;
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {2,3,1,1,4}; // Input array
        System.out.println(jump(nums));
    }
}
