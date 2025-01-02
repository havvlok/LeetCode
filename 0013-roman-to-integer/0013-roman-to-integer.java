class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int count = 0;
        while(count < s.length()){
            if(s.charAt(count) == 'I'){
                if(count+1 < s.length() && s.charAt(count+1) == 'V'){
                    ans += 4;
                    count++;
                }
                else if(count+1 < s.length() && s.charAt(count+1) == 'X'){
                    ans += 9;
                    count++;
                }
                else{
                    ans += 1;
                }
            }
            else if(s.charAt(count) == 'V'){
                ans += 5;
            }
            else if(s.charAt(count) == 'X'){
                if(count+1 < s.length() && s.charAt(count+1) == 'L'){
                    ans += 40;
                    count++;
                }
                else if(count+1 < s.length() && s.charAt(count+1) == 'C'){
                    ans += 90;
                    count++;
                }
                else{
                    ans += 10;
                }
            }
            else if(s.charAt(count) == 'L'){
                ans += 50;
            }
            else if(s.charAt(count) == 'C'){
                if(count+1 < s.length() && s.charAt(count+1) == 'D'){
                    ans += 400;
                    count++;
                }
                else if(count+1 < s.length() && s.charAt(count+1) == 'M'){
                    ans += 900;
                    count++;
                }
                else{
                    ans += 100;
                }
            }
            else if(s.charAt(count) == 'D'){
                ans += 500;
            }
            else if(s.charAt(count) == 'M'){
                ans += 1000;
            }
            count++;
        }
        return ans;
    }
}