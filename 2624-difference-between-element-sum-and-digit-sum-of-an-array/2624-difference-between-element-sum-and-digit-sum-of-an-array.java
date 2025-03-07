class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,dif=0;
        for(int i : nums){
            sum+=i;
        }
        for(int i: nums){
            while(i>0){
                dif+=i%10;
                i/=10;
            }
        }
        return Math.abs(sum-dif);
    }
}