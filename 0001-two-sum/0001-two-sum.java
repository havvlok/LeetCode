class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int a=0;a<nums.length;a++){
            for(int b=a+1;b<nums.length;b++){
                if(nums[a]+nums[b]==target){
                    return new int[]{a,b};
                }
                if(nums[nums.length-a-1] + nums[nums.length-b-1] == target){
                    return new int[]{nums.length-b-1, nums.length-a-1};
                }
            }
        }
        return null;
    }
}