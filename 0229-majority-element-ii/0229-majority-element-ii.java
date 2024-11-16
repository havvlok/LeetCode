class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i : nums){
            h.put(i,h.getOrDefault(i,0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            
            // Check if the element count is greater than the threshold
            if (count > nums.length/3) {
                ans.add(element);
            }
        }
        return ans;
    }
}