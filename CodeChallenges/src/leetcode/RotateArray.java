package leetcode;

import java.util.Arrays;

/**
 * LeetCode:
 * 189. Rotate Array
 * <a href='https://leetcode.com/problems/rotate-array/description/'>
 */
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        k = nums.length - k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, nums.length - k, nums.length -1);
        reverse(nums, 0, nums.length - k - 1);
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            nums[start] += nums[end];
            nums[end] = nums[start]-nums[end];
            nums[start++] -= nums[end--];
        }
    }

    public static void main (String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7}; // Input array
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
