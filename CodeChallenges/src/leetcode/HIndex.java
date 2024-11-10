package leetcode;

/**
 * LeetCode:
 * 274. H-Index
 * <a href='https://leetcode.com/problems/h-index/description/'>
 */
public class HIndex {

    public static int hIndex(int[] citations) {
        int[] freq = new int[1005];
        for (int citation : citations) {
            freq[citation]++;
        }
        for (int i = freq.length - 2; i >= 0; i--) {
            freq[i] += freq[i + 1];
            if (freq[i] >= i) {
                return i;
            }
        }
        return 0;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {3,0,6,1,5}; // Input array
        System.out.println(hIndex(nums));
    }
}
