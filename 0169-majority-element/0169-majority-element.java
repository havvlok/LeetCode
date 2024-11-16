class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : nums){
            if(h.containsKey(i)){
                 int newV = h.get(i)+1;
                h.put(i,newV);
                
            }else{
                h.put(i,1);
            }
           
            if(h.get(i) > nums.length/2){
                return i;
            }
        }
        return 0;
    }
}