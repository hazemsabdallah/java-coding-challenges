package others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /* Question
    Given an array of integers and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.
    https://leetcode.com/problems/two-sum/description/
     */
    public static void main(String[] args) {

        // example input
        int[] numbers = new int[] {-2, 3, 7, 4, 8};
        int target = 6;

        int[] result = getTwoIndices(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getTwoIndices(int[] numbers, int target) {

        Map<Integer, Integer> visited = new HashMap<>();

        // time complexity is maintained at O(n) as we're using 1 loop
        // and visited functions run in constant time
        for (int i = 0; i < numbers.length; i++) {
            int targetComplement = target - numbers[i];
            if (visited.containsKey(targetComplement)) {
                return new int[] {visited.get(targetComplement), i};
            }
            visited.put(numbers[i], i);
        }

        // handling if no answer available, we can throw error or return empty array or null
        return new int[] {};
    }
}
