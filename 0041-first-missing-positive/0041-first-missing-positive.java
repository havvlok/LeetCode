class Solution {
    public int firstMissingPositive(int[] a) {
        int i =0;
         while (i < a.length) {
            int c = a[i]-1;
            if (a[i] > 0 && a[i] < a.length && a[i] != a[c]) {
                    int temp = a[i];
                    a[i] = a[c];
                    a[c] = temp;
            } else {
                i++;
            }    
        }

        for(int x =0;x<a.length;x++){
            if(a[x]!=x+1){
                return x+1;
            }
        }
        return a.length+1;
    }
}