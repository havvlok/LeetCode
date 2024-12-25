class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int s = 0;
        int e = nums.length - 1;
        int he = nums.length -1;
        while(s <= e){
            int ss = nums[s] * nums[s];
            int es = nums[e] * nums[e];
            if(ss >= es){
                ans[he] = ss;
                s++;
            } else{
                 ans[he] = es;
                 e--;
            }
            he--;
        }
        return ans;
    }
}