class Solution {
public int findKthPositive(int[] arr, int k) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int m = low + (high - low) / 2;
        int mis = arr[m] - (m + 1);
        if (mis < k) {
            low = m + 1;
        } else {
            high = m - 1;
        }
    }
    return high + k + 1;
}
}