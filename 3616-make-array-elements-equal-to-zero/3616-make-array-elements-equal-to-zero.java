class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int[]pre=new int[n];
        int[]pos=new int[n];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            pos[i]=pos[i+1]+nums[i+1];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                continue;
            }
            if(pre[i]==pos[i]){
                sum+=2;
            }
            if(Math.abs(pre[i]-pos[i])==1){
                sum+=1;
            }
        }
        return sum;
    }
}