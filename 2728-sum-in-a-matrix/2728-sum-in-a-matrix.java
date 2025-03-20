class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length,m=nums[0].length,sum=0,max=0;
        for(int[] i:nums){
            Arrays.sort(i);
        }
        for(int i=0;i<m;i++){
            max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                max=Math.max(max,nums[j][i]);
            }
            sum+=max;
        }
        return sum;
    }
}