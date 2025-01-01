class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while(p >= 0){
            if(i < 0){
                nums1[p] = nums2[j];
                j--;
                p--;
            }
            else if(j < 0){
                break;
            }
            else if(nums1[i] >= nums2[j]){
                nums1[p] = nums1[i];
                i--;
                p--;
            }
            else{
                nums1[p] = nums2[j];
                j--;
                p--;
            }
        }
    }
}