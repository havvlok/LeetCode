class Solution {
    public String interpret(String command) {
        int n = 0;
        StringBuilder ans = new StringBuilder();
        while(n < command.length()){
            if(command.charAt(n) == 'G'){
                n++;
                ans.append("G");
            }
            else if(command.charAt(n) == '(' && command.charAt(n+1) == ')'){
                n += 2;
                ans.append("o");
            }
            else{
                n += 4;
                ans.append("al");
            }
        }
        return ans.toString();
    }
}