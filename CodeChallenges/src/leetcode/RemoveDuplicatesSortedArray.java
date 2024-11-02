package leetcode;

import java.util.Arrays;

/**
 * LeetCode:
 * 26. Remove Duplicates from Sorted Array
 * <a href='https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/'>
 */
public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int previous = nums[0];
        int insertAt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previous) {
                nums[insertAt++] = nums[i];
                previous = nums[i];
            }
        }
        return insertAt;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = new int[] {0,1,2,3,4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
