class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> h = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        int t = target - nums[i];
        if(h.containsKey(t)){
            return new int[]{h.get(t), i};
        } else {
            h.put(nums[i], i);
        }
    }
    return null;
}
}