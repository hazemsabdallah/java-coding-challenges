package others;

public class SmallestSubarraySum {
    /*
    Given an array arr[] of integers and a number x,
    the task is to find the minimum length of subarray with a sum greater than the given value k.
     */
    public static void main(String[] args) {
        // example input
        int[] arr = new int[] {1, 4, 45, 6, 0, 19};
        int n = arr.length;
        int key = 51;

        System.out.println(subarrayBinarySearch(arr, n, key));
    }

    public static int subarrayBinarySearch(int[] arr, int n, int key) {
        int low = 1, high = n, result = 0;

        while(low <= high) {
            int mid = (low + high) / 2;

            // checking if a subarray with greater sum than key is present
            boolean isPresent = false;
            int tempSum = 0;
            for (int i = 0; i < mid; i++) {
                tempSum += arr[i];
            }
            if (tempSum > key) {
                isPresent = true;
            }
            // sliding window
            for (int i = mid, j = 0; i < n; i++, j++) {
                tempSum -= arr[j];
                tempSum += arr[i];
                if (tempSum > key) {
                    isPresent = true;
                }
            }

            // handling binary search adjustments
            if (isPresent) {
                result = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return result;
    }
}
