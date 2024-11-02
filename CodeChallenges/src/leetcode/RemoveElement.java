package leetcode;

import static java.util.Arrays.sort;

/**
 * LeetCode:
 * 27. Remove Element
 * <a href='https://leetcode.com/problems/remove-element/description/'>
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0, j = nums.length - 1; i <= j; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[j--];
                k--;
            }
        }
        return k;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = new int[] {0,0,1,3,4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

//        System.out.println(k);
//        System.out.println(Arrays.toString(nums));

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
