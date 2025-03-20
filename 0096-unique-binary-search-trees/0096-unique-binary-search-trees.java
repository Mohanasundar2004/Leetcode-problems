class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=1;
        }
        for(int i=2;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum+=dp[j-1]*dp[i-j];
            }
            dp[i]=sum;
        }
        return dp[n];
    }
}