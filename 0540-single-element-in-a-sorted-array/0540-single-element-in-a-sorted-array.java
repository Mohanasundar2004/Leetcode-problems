class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=0;
        for(int i:nums){
            n^=i;
        }
        return n;
    }
}