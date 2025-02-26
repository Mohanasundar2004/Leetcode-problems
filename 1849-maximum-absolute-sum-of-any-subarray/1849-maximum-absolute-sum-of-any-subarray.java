class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0,min=0,sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        sum=0;
        for(int i=0;i<n;i++){
            if(sum>0){
                sum=0;
            }
            sum+=nums[i];
            min=Math.min(sum,min);
        }
        return Math.max(max,Math.abs(min));
    }
}