class Solution {
    public String restoreString(String s, int[] indices) {
        char[] h = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            h[indices[i]] = s.charAt(i);
        }
        return new String(h);
    }
}