package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode:
 * 88. Merge Sorted Array
 * <a href='https://leetcode.com/problems/merge-sorted-array/description/'>
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer=m-1, nums2Pointer=n-1, overallPointer=m+n-1;
        while(nums1Pointer>=0 && nums2Pointer>=0) {
            if(nums1[nums1Pointer]>nums2[nums2Pointer]) {
                nums1[overallPointer--]=nums1[nums1Pointer--];
            } else {
                nums1[overallPointer--]=nums2[nums2Pointer--];
            }
        }
        while(nums2Pointer>=0) {
            nums1[overallPointer--]=nums2[nums2Pointer--];
        }

        // less efficient queue based solution
//        int i=0, j=0;
//        Queue<Integer> q = new LinkedList<>();
//        while (i<m && j<n) {
//            if (nums1[i]<nums2[j]) {
//                q.add(nums1[i]);
//                i++;
//            } else {
//                q.add(nums2[j]);
//                j++;
//            }
//        }
//        while (i<m) {
//            q.add(nums1[i++]);
//        }
//        while (j<n){
//            q.add(nums2[j++]);
//        }
//        for (int k = 0; k < nums1.length; k++) {
//            nums1[k] = q.poll();
//        }
    }
    public static void main (String[] args) {
        int[] nums1 = new int[] {0,0,3,0,0,0,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {-1,1,1,1,2,3};
        int n = 6;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
