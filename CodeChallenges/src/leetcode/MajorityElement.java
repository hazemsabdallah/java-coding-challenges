package leetcode;

/**
 * LeetCode:
 * 169. Majority Element
 * <a href='https://leetcode.com/problems/majority-element/description/'>
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 1;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                current = nums[i];
            }
            count = (nums[i] == current) ? count+1 : count-1;
        }
        return current;
//        int threshold = nums.length / 2;
//        int result = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (!map.containsKey(num)) {
//                map.put(num, 0);
//            }
//            map.put(num, map.get(num) + 1);
//            if (map.get(num) > threshold) {
//                result = num;
//                break;
//            }
//        }
//        return result;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {2,2,1,1,2,3,3,2}; // Input array
        System.out.println(majorityElement(nums));
    }
}
