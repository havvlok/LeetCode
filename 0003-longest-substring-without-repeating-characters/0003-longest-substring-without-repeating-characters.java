class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        int start = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(h.containsKey(c)){
                start = Math.max(start, h.get(c) + 1);
            }
            h.put(c,i);
            max = Math.max(max, i - start +1);
        }
        return max;
    }
}