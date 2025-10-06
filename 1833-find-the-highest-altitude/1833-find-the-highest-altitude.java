class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,n=gain.length,a=0;
        for(int i=0;i<n;i++){
            a+=gain[i];
            max=Math.max(max,a);
        }
        return max;
    }
}