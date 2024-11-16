class Solution {
    public boolean isHappy(int n) {
        Set<Integer> v = new HashSet<>();
        while(!v.contains(n)){
            v.add(n);
            int o = 0;
            while(n > 0){
                int dig = n % 10;
                o += dig * dig;
                n = n /10;
            }
            n = o;
            if(n == 1){
                return true;
            }
        }
        return false;
    }
}