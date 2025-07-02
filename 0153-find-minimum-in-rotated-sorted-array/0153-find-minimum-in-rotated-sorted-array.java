class Solution {
    public int findMin(int[] nums) {
        int c=nums[0],n=nums.length;
        for(int i:nums){
            c=Math.min(c,i);
        }
        return c;
    }
}